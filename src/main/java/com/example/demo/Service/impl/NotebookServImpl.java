package com.example.demo.Service.impl;

import com.example.demo.Repo.NoteBookRepo;
import com.example.demo.Service.NotebookServIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotebookServImpl implements NotebookServIn {

    @Autowired
    private NoteBookRepo noteBookRepo;
}
