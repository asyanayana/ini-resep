package com.pt2.iniresep.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pt2.iniresep.models.FoodRecipe
import com.pt2.iniresep.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}