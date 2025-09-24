
CREATE TABLE tb_player (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    power INTEGER NOT NULL,
    level_player INTEGER NOT NULL,
    class_type VARCHAR(100) NOT NULL,
    lore TEXT NOT NULL
);