package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.images1),
            Affirmation(R.string.affirmation2, R.drawable.images2),
            Affirmation(R.string.affirmation3, R.drawable.images3),
            Affirmation(R.string.affirmation4, R.drawable.images4),
            Affirmation(R.string.affirmation5, R.drawable.images5),
            Affirmation(R.string.affirmation6, R.drawable.images6),
            Affirmation(R.string.affirmation7, R.drawable.images7),
            Affirmation(R.string.affirmation8, R.drawable.images8),
            Affirmation(R.string.affirmation9, R.drawable.images9),
            Affirmation(R.string.affirmation10, R.drawable.images10),
            Affirmation(R.string.affirmation11, R.drawable.images11),
            Affirmation(R.string.affirmation12, R.drawable.images12)
        )
    }
}