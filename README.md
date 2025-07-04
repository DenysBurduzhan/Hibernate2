# 🎬 Movie Rental System (Hibernate + MySQL)

Этот проект реализует взаимодействие с базой данных `movie`, импортированной из SQL-дампа. Основная цель — реализовать сущности, транзакционные методы и симуляцию работы видеопроката (аренда, возврат, оплата, добавление фильмов).

## ✅ Реализованные функции

### 1. Создание нового покупателя (`customer`) с адресом (`address`)
- Метод транзакционный
- Сначала сохраняется адрес, затем покупатель

### 2. Возврат фильма
- Устанавливается `return_date` в таблице `rental`
- Показывает, как покупатель возвращает ранее арендованный фильм

### 3. Аренда фильма + оплата
- Проверяется доступность инвентаря (через `rental.return_date`)
- Создаются записи `rental` и `payment`

### 4. Добавление нового фильма
- Создаются `film`, `inventory`, `film_actor`, `film_category`
- Всё в одной транзакции

## ⚠️ Проблемы в структуре БД (ляпи)

### ❌ Отсутствие внешнего ключа:
- Таблица `film_text(film_id)` не связана с таблицей `film`
```sql
-- Рекомендуемое исправление:
ALTER TABLE film_text
FOREIGN KEY (film_id) REFERENCES film(film_id);