package com.example.quiz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {

    private List<GameCharacter> characterList;

    public CharacterAdapter(List<GameCharacter> characterList) {
        this.characterList = characterList;
    }

    @Override
    public CharacterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game_character, parent, false);
        return new CharacterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CharacterViewHolder holder, int position) {
        GameCharacter character = characterList.get(position);
        holder.nameTextView.setText(character.getName());
        holder.descriptionTextView.setText(character.getDescription());
        holder.characterImageView.setImageResource(character.getImageResource());
    }

    @Override
    public int getItemCount() {
        return characterList.size();
    }

    public class CharacterViewHolder extends RecyclerView.ViewHolder {
        ImageView characterImageView;
        TextView nameTextView;
        TextView descriptionTextView;

        public CharacterViewHolder(View itemView) {
            super(itemView);
            characterImageView = itemView.findViewById(R.id.characterImage);
            nameTextView = itemView.findViewById(R.id.characterName);
            descriptionTextView = itemView.findViewById(R.id.characterDescription);
        }
    }
}
