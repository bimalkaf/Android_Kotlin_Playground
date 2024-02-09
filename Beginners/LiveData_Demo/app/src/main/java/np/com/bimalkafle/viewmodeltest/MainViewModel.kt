package np.com.bimalkafle.viewmodeltest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _count = MutableLiveData(0)

    val count : LiveData<Int>
        get() = _count


    fun increaseCount(){
        _count.value = _count.value?.plus(1)
    }

    fun decreaseCount(){
        _count.value = _count.value?.minus(1)
    }


}