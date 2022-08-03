package com.example.dualpanefortabletusingfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dualpanefortabletusingfragment.databinding.FragmentABinding
import com.example.dualpanefortabletusingfragment.databinding.FragmentBBinding
import com.example.recyclerviewinfragment.adapters.CustomRecyclerViewAdapter
import com.example.recyclerviewinfragment.models.Course

class FragmentA : Fragment(), CustomRecyclerViewAdapter.OnItemClickListener {
    private lateinit var binding: FragmentABinding

    var dataHolder : ArrayList<Course> = ArrayList<Course>()
    private lateinit var comm: Communicator

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentABinding.inflate(inflater , container , false)

        var recyclerView = binding.recyclerView

        comm = requireActivity() as Communicator

        dataHolder.add(Course("Android Development" , "Android OS is a Linux-based mobile operating system that primarily runs on smartphones and tablets. The Android platform includes an operating system based upon the Linux kernel, a GUI, a web browser and end-user applications that can be downloaded" , 25000))
        dataHolder.add(Course("C++" , "C++ is a statically typed, compiled, general-purpose, case-sensitive, free-form programming language that supports procedural, object-oriented, and generic programming. C++ is regarded as a middle-level language, as it comprises a combination of both high-level and low-level language features." , 7000))
        dataHolder.add(Course("Java" , "Java is a widely used object-oriented programming language and software platform that runs on billions of devices, including notebook computers, mobile devices, gaming consoles, medical devices and many others. The rules and syntax of Java are based on the C and C++ languages" , 13000))
        dataHolder.add(Course("Python" , "Python is a computer programming language often used to build websites and software, automate tasks, and conduct data analysis. Python is a general-purpose language, meaning it can be used to create a variety of different programs and isn't specialized for any specific problems" , 8000))
        dataHolder.add(Course("Html" , "HyperText Markup Language (HTML) is the basic scripting language used by web browsers to render pages on the world wide web. HyperText allows a user to click a link and be redirected to a new page referenced by that link." , 5000))
        dataHolder.add(Course("Css" , "Cascading Style Sheets (CSS) is a stylesheet language used to describe the presentation of a document written in HTML or XML" , 5000))
        dataHolder.add(Course("DJango" , "Django is a high-level Python web framework that enables rapid development of secure and maintainable websites. Built by experienced developers, Django takes care of much of the hassle of web development, so you can focus on writing your app without needing to reinvent the wheel." , 8000))
        dataHolder.add(Course("DBMS" , "A database management system (or DBMS) is essentially nothing more than a computerized data-keeping system. Users of the system are given facilities to perform several kinds of operations on such a system for either manipulation of the data in the database or the management of the database structure itself." , 8000))
        dataHolder.add(Course("DSA" , "A data structure is a specialized format for organizing, processing, retrieving and storing data. There are several basic and advanced types of data structures, all designed to arrange data to suit a specific purpose. Data structures make it easy for users to access and work with the data they need in appropriate ways." , 25000))
        dataHolder.add(Course("C" , "C is an imperative procedural language supporting structured programming, lexical variable scope, and recursion, with a static type system. It was designed to be compiled to provide low-level access to memory and language constructs that map efficiently to machine instructions, all with minimal runtime support." , 5000))
        dataHolder.add(Course("C#" , "C# (pronounced \"See Sharp\") is a modern, object-oriented, and type-safe programming language. C# enables developers to build many types of secure and robust applications that run in . NET. C# has its roots in the C family of languages and will be immediately familiar to C, C++, Java, and JavaScript programmers" , 5000))
        dataHolder.add(Course("Web Development" , "Web development is the work involved in developing a website for the Internet (World Wide Web) or an intranet (a private network). Web development can range from developing a simple single static page of plain text to complex web applications, electronic businesses, and social network services." , 25000))

        dataHolder.add(Course("Android Development" , "Android OS is a Linux-based mobile operating system that primarily runs on smartphones and tablets. The Android platform includes an operating system based upon the Linux kernel, a GUI, a web browser and end-user applications that can be downloaded" , 25000))
        dataHolder.add(Course("C++" , "C++ is a statically typed, compiled, general-purpose, case-sensitive, free-form programming language that supports procedural, object-oriented, and generic programming. C++ is regarded as a middle-level language, as it comprises a combination of both high-level and low-level language features." , 7000))
        dataHolder.add(Course("Java" , "Java is a widely used object-oriented programming language and software platform that runs on billions of devices, including notebook computers, mobile devices, gaming consoles, medical devices and many others. The rules and syntax of Java are based on the C and C++ languages" , 13000))
        dataHolder.add(Course("Python" , "Python is a computer programming language often used to build websites and software, automate tasks, and conduct data analysis. Python is a general-purpose language, meaning it can be used to create a variety of different programs and isn't specialized for any specific problems" , 8000))
        dataHolder.add(Course("Html" , "HyperText Markup Language (HTML) is the basic scripting language used by web browsers to render pages on the world wide web. HyperText allows a user to click a link and be redirected to a new page referenced by that link." , 5000))
        dataHolder.add(Course("Css" , "Cascading Style Sheets (CSS) is a stylesheet language used to describe the presentation of a document written in HTML or XML" , 5000))
        dataHolder.add(Course("DJango" , "Django is a high-level Python web framework that enables rapid development of secure and maintainable websites. Built by experienced developers, Django takes care of much of the hassle of web development, so you can focus on writing your app without needing to reinvent the wheel." , 8000))
        dataHolder.add(Course("DBMS" , "A database management system (or DBMS) is essentially nothing more than a computerized data-keeping system. Users of the system are given facilities to perform several kinds of operations on such a system for either manipulation of the data in the database or the management of the database structure itself." , 8000))
        dataHolder.add(Course("DSA" , "A data structure is a specialized format for organizing, processing, retrieving and storing data. There are several basic and advanced types of data structures, all designed to arrange data to suit a specific purpose. Data structures make it easy for users to access and work with the data they need in appropriate ways." , 25000))
        dataHolder.add(Course("C" , "C is an imperative procedural language supporting structured programming, lexical variable scope, and recursion, with a static type system. It was designed to be compiled to provide low-level access to memory and language constructs that map efficiently to machine instructions, all with minimal runtime support." , 5000))
        dataHolder.add(Course("C#" , "C# (pronounced \"See Sharp\") is a modern, object-oriented, and type-safe programming language. C# enables developers to build many types of secure and robust applications that run in . NET. C# has its roots in the C family of languages and will be immediately familiar to C, C++, Java, and JavaScript programmers" , 5000))
        dataHolder.add(Course("Web Development" , "Web development is the work involved in developing a website for the Internet (World Wide Web) or an intranet (a private network). Web development can range from developing a simple single static page of plain text to complex web applications, electronic businesses, and social network services." , 25000))

        dataHolder.add(Course("Android Development" , "Android OS is a Linux-based mobile operating system that primarily runs on smartphones and tablets. The Android platform includes an operating system based upon the Linux kernel, a GUI, a web browser and end-user applications that can be downloaded" , 25000))
        dataHolder.add(Course("C++" , "C++ is a statically typed, compiled, general-purpose, case-sensitive, free-form programming language that supports procedural, object-oriented, and generic programming. C++ is regarded as a middle-level language, as it comprises a combination of both high-level and low-level language features." , 7000))
        dataHolder.add(Course("Java" , "Java is a widely used object-oriented programming language and software platform that runs on billions of devices, including notebook computers, mobile devices, gaming consoles, medical devices and many others. The rules and syntax of Java are based on the C and C++ languages" , 13000))
        dataHolder.add(Course("Python" , "Python is a computer programming language often used to build websites and software, automate tasks, and conduct data analysis. Python is a general-purpose language, meaning it can be used to create a variety of different programs and isn't specialized for any specific problems" , 8000))
        dataHolder.add(Course("Html" , "HyperText Markup Language (HTML) is the basic scripting language used by web browsers to render pages on the world wide web. HyperText allows a user to click a link and be redirected to a new page referenced by that link." , 5000))
        dataHolder.add(Course("Css" , "Cascading Style Sheets (CSS) is a stylesheet language used to describe the presentation of a document written in HTML or XML" , 5000))
        dataHolder.add(Course("DJango" , "Django is a high-level Python web framework that enables rapid development of secure and maintainable websites. Built by experienced developers, Django takes care of much of the hassle of web development, so you can focus on writing your app without needing to reinvent the wheel." , 8000))
        dataHolder.add(Course("DBMS" , "A database management system (or DBMS) is essentially nothing more than a computerized data-keeping system. Users of the system are given facilities to perform several kinds of operations on such a system for either manipulation of the data in the database or the management of the database structure itself." , 8000))
        dataHolder.add(Course("DSA" , "A data structure is a specialized format for organizing, processing, retrieving and storing data. There are several basic and advanced types of data structures, all designed to arrange data to suit a specific purpose. Data structures make it easy for users to access and work with the data they need in appropriate ways." , 25000))
        dataHolder.add(Course("C" , "C is an imperative procedural language supporting structured programming, lexical variable scope, and recursion, with a static type system. It was designed to be compiled to provide low-level access to memory and language constructs that map efficiently to machine instructions, all with minimal runtime support." , 5000))
        dataHolder.add(Course("C#" , "C# (pronounced \"See Sharp\") is a modern, object-oriented, and type-safe programming language. C# enables developers to build many types of secure and robust applications that run in . NET. C# has its roots in the C family of languages and will be immediately familiar to C, C++, Java, and JavaScript programmers" , 5000))
        dataHolder.add(Course("Web Development" , "Web development is the work involved in developing a website for the Internet (World Wide Web) or an intranet (a private network). Web development can range from developing a simple single static page of plain text to complex web applications, electronic businesses, and social network services." , 25000))

        recyclerView.adapter = CustomRecyclerViewAdapter(dataHolder , this)
        val manager = LinearLayoutManager(activity)
        manager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = manager

        return binding.root
    }

    override fun onItemClick(position: Int) {
        val clickedItem = dataHolder[position]
        comm.passDataCom(clickedItem.courseName , clickedItem.descriptiom , clickedItem.fee)
    }

}