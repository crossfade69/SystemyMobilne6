package com.example.libraryapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class BookViewModel extends AndroidViewModel {
    private final BookRepository bookRepo;
    private final LiveData<List<Book>> books;

    public BookViewModel(@NonNull Application application){
        super(application);
        bookRepo = new BookRepository(application);
        books = bookRepo.findAllBooks();
    }

    public LiveData<List<Book>> findAll() {return books;}

    public void insert(Book book) {bookRepo.insert(book);}

    public void update(Book book) {bookRepo.update(book);}

    public void delete(Book book) {bookRepo.delete(book);}

}
