CREATE TABLE IF NOT EXISTS subscriptions_type (
                                                  subscriptions_type_id SERIAL PRIMARY KEY,
                                                  name VARCHAR(255) NOT NULL,
    access_months INT,
    price DECIMAL(10,2) NOT NULL,
    product_key VARCHAR(255)
    );

CREATE TABLE IF NOT EXISTS user_type (
                                         user_type_id SERIAL PRIMARY KEY,
                                         name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS users (
                                     users_id SERIAL PRIMARY KEY,
                                     name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone VARCHAR(255) NOT NULL,
    cpf VARCHAR(255) NOT NULL,
    dt_subscription DATE NOT NULL,
    dt_expiration DATE NOT NULL,
    user_type_id INT,
    subscriptions_type_id INT,
    CONSTRAINT users_email_unique UNIQUE(email),
    CONSTRAINT users_cpf_unique UNIQUE(cpf),
    CONSTRAINT users_phone_unique UNIQUE(phone),
    CONSTRAINT fk_user_type_id FOREIGN KEY(user_type_id) REFERENCES user_type(user_type_id),
    CONSTRAINT fk_subscriptions_type_id FOREIGN KEY(subscriptions_type_id) REFERENCES subscriptions_type(subscriptions_type_id)
    );

CREATE TABLE IF NOT EXISTS user_payment_info (
                                                 user_payment_info_id SERIAL PRIMARY KEY,
                                                 card_number VARCHAR(255) NOT NULL,
    card_expiration_month INT NOT NULL,
    card_expiration_year INT NOT NULL,
    card_security_code VARCHAR(255) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    instalments INT NOT NULL,
    dt_payment DATE NOT NULL,
    user_id INT,
    CONSTRAINT user_payment_info_card_number_unique UNIQUE(card_number),
    CONSTRAINT fk_user_id FOREIGN KEY(user_id) REFERENCES users(users_id)
    );

-- Inserts iniciais
INSERT INTO subscriptions_type (name, access_months, price, product_key) VALUES
                                                                             ('PLANO MENSAL', 1, 75.00, 'MONTH22'),
                                                                             ('PLANO ANUAL', 12, 697.00, 'YEAR22'),
                                                                             ('PLANO VITALICIO', NULL, 1497.00, 'PERPETUAL22');

INSERT INTO user_type (name, description) VALUES
                                              ('PROFESSOR', 'Professores da plataforma - cadastro administrativo'),
                                              ('ADMINISTRADOR', 'Administrado da plataforma - cadastro administrativo'),
                                              ('ALUNO', 'Aluno da plataforma - cadastro via fluxo normal');
