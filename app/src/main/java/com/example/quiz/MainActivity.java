package com.example.quiz;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CharacterAdapter adapter;
    private List<GameCharacter> characterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        characterList = new ArrayList<>();
        
        characterList.add(new GameCharacter("Leon S. Kennedy", "Superviviente de Raccoon City y agente de élite.", R.drawable.leon));
        characterList.add(new GameCharacter("Jill Valentine", "Ex-miembro de S.T.A.R.S. y experta en supervivencia.", R.drawable.jill));
        characterList.add(new GameCharacter("Chris Redfield", "Capitán de la B.S.A.A. y veterano de la saga.", R.drawable.chris));
        characterList.add(new GameCharacter("Albert Wesker", "Ex-líder de S.T.A.R.S. con ambiciones globales.", R.drawable.albert));
        characterList.add(new GameCharacter("Claire Redfield", "Hermana de Chris y superviviente de Raccoon City.", R.drawable.claire));
        characterList.add(new GameCharacter("Nemesis", "Bio-arma creada para eliminar a los S.T.A.R.S.", R.drawable.nemesis));

        adapter = new CharacterAdapter(characterList);
        recyclerView.setAdapter(adapter);
    }
}
