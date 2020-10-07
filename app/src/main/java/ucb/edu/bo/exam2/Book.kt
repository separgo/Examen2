package ucb.edu.bo.exam2

import androidx.room.ColumnInfo
import  androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Year

@Entity(tableName = "book_table")
class Book (@ColumnInfo(name = "title") var title: String,
            @ColumnInfo(name = "year") var year: String,
            @ColumnInfo(name = "URL") var URL: String){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0
}