package com.example.simpleblog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *  Entity - сущность, которая является отображением Java объекта в базе данных.
 *  Является понятием JPA, которое предоставляет возможность сохранять в удобном виде Java-объекты в БД,
 *      т.е. Entity будет представлять таблицу в БД, все поля Entity будут являтся колонками таблицы,
 *      в то же время объект Entity станет записью в таблице
 *
 *  JPA по сути является стандартным интерфейсом, который направлен на стандартизацию ORM продуктов,
 *      описывает требования к объектам для сохранения их в базах данных, интерфейсы для сохранения объектов
 *      и интерфейсы для получения объектов из БД (использует JDBC «под капотом»).
 *
 *  Entity описаны в спецификации JPA, есть обязательные правила, которым Entity должны соответствовать:
 *      1. Классы сущностей должны быть аннотированы как @Entity
 *      2. Каждая сущность должна иметь "первичный ключ", аннотированый как @Id
 *      3. Сущности необходим публичный конструктор без аргументов
 *      4. Сущностью не может быть вложенный класс, интерфейс или enum
 *      5. Сущность не может быть final и не может содержать final-полей/свойств
 *
 *  Аннотация @Id, размещенная над полем, дает прямой доступ к полям для провайдера JPA (AccessType.FIELD)
 *  Аннотация @Id, размещенная над геттером, дает доступ к полю через геттер
 *      (куда можно заложить какую то логику, AccessType.PROPERTY)
 */

@Entity
public class Post{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String title, anons, fullText;
    private int views;

    public Post() {
    }

    public Post(String title, String anons, String fullText) {
        this.title = title;
        this.anons = anons;
        this.fullText = fullText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
