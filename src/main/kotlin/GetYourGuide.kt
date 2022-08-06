import java.text.SimpleDateFormat
import java.util.*

const val data = "photo.jpg, Warsaw, 2013-09-05 14:08:15\n" +
        "john.png, London, 2015-06-20 15:13:22\n" +
        "myFriends.png, Warsaw, 2013-09-05 14:07:13\n" +
        "Eiffel.jpg, Paris, 2015-07-23 08:03:02\n" +
        "pisatower.jpg, Paris, 2015-07-22 23:59:59\n" +
        "BOB.jpg, London, 2015-08-05 00:02:03\n" +
        "notredame.png, Paris, 2015-09-01 12:00:00\n" +
        "me.jpg, Warsaw, 2013-09-06 15:40:22\n" +
        "a.png, Warsaw, 2016-02-13 13:33:50\n" +
        "b.jpg, Warsaw, 2016-01-02 15:12:22\n" +
        "c.jpg, Warsaw, 2016-01-02 14:34:30\n" +
        "d.jpg, Warsaw, 2016-01-02 15:15:01\n" +
        "e.png, Warsaw, 2016-01-02 09:49:09\n" +
        "f.png, Warsaw, 2016-01-02 10:55:32\n" +
        "g.jpg, Warsaw, 2016-02-29 22:13:11"

class GetYourGuide {
    fun solution(s: String): String {
        val array = s.split("\n")
        val photoList = mutableListOf<Photo>()
        array.forEach {
            photoList.add(Photo(getCityName(it), getTimeStampFromPhotoName(it), getPhotoExt(it)))
        }

        val sortedPhotoList = photoList.sortedBy { it.time }

        val result = buildString {
            sortedPhotoList.forEachIndexed { index, photo ->
                append(photo.city.plus(index+1) + photo.ext + " ${photo.time}" + "\n")
            }
        }
        return result
    }
}

data class Photo(val city: String, val time: String, val ext: String)

fun getPhotoExt(photoName: String): String {
    return when {
        photoName.contains("jpeg") -> ".jpeg"
        photoName.contains("png") -> ".png"
        photoName.contains("jpg") -> ".jpg"
        else -> ".jpg"
    }
}

fun getTimeStampFromPhotoName(photoName: String): String {
    val indexOfFirstComma = photoName.lastIndexOf(",")
    return  photoName.substring(indexOfFirstComma + 1, photoName.length).trim()
}

fun getCityName(photoName: String): String {
    val indexOfFirstComma = photoName.indexOf(",")
    val indexOfLastComma = photoName.lastIndexOf(",")
    return photoName.substring(indexOfFirstComma + 1, indexOfLastComma).trim()
}

fun main() {
    val getYourGuide = GetYourGuide()
    println(getYourGuide.solution(data))
}