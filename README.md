# آزمایش ششم

## سوال 1:
نمودار استقرار به شکل زیر است:

![Deployment Diagram](https://github.com/alirezababazadeh/DockerizedMicroservices/assets/45295180/cdd72833-df00-4a82-a632-a604f9dcf725)

همچنین نمودار مولفه نیز برای نمایش روابط بین مولفه ها در ادامه آمده است:

![Component Diagram](https://github.com/alirezababazadeh/DockerizedMicroservices/assets/45295180/fcfa7810-7ea0-4145-ba3e-3b26ca160fd5)

<br>

## سوال 2:
برای دیتابیس نیازی به Dockerfile جدا نبود. از آنجا که از docker-compose استفاده کردیم، میتوان دیتابیس را به وسیله آن مدیریت کرد. برای وب سرور و اپلیکیشن در سورس قابل مشاهده است.
<br>

## سوال 3:

نمایش مراحل مختلف قابل مشاهده است:

![Building](https://github.com/alirezababazadeh/DockerizedMicroservices/assets/45295180/77ba0077-102a-4bff-be61-16b7b35a89a6)

## سوال 4:
docker ps:

![docker ps command](https://github.com/alirezababazadeh/DockerizedMicroservices/assets/45295180/302aebcb-8770-45f3-b921-3a06239687fa)

docker image ls:

![docker image ls command](https://github.com/alirezababazadeh/DockerizedMicroservices/assets/45295180/ac8afcbb-5958-41f4-8608-3fb62e8a7f14)


## سوال 5:

کالکشن postman به همراه sample ها پیوست شده است. همچنین عکس های اجرا شده از عملیات 4 گانه CRUD نیز به شرح زیر هستند:

![1  Post - test](https://github.com/alirezababazadeh/DockerizedMicroservices/assets/45295180/bec59e99-85c1-486f-bf5a-d84396929604)

![2 1 Get - test](https://github.com/alirezababazadeh/DockerizedMicroservices/assets/45295180/eafc2bc4-344a-4d20-b5b0-f5c7d78941a8)

![2 2 Get - test](https://github.com/alirezababazadeh/DockerizedMicroservices/assets/45295180/3f5945b7-ff64-4f74-94e0-74ee0b2895f2)

![3  Put - test](https://github.com/alirezababazadeh/DockerizedMicroservices/assets/45295180/34114c53-55a1-44db-9eb1-9f212bccc151)

![3  Delete - test](https://github.com/alirezababazadeh/DockerizedMicroservices/assets/45295180/a84cbcf8-46e0-4661-98ce-c683c9baf1fd)

# سوالات:

## سوال 1: 

از 2 نمودار استقرار و مولفه در طراحی آن استفاده شد.

## سوال 2: 
  
به طور کلی هدف کلی این رویکرد این است که بگوید ساختار و زبان کد یک نرم افزار، باید با حوزه کسب و کار آن مطابقت داشته باشد. طراحی دامنه محور (DDD) رویکردی برای توسعه نرم افزار برای نیازهای پیچیده با اتصال عمیق پیاده سازی به یک مدل در حال تکامل است. به کمک این امر باعث می شود تا پیچیدگی ای که در قلب نرم افزار وجود دارد ساده تر شوند.

به صورت کلی با کمک DDD می‌توان سیستم را از یک کلیت به قسمت های کوچک تر شکاند و هرکدام از آن ها را به صورت مستقل میکروسرویس درنظر گرفت که در اصل نمایش دهنده bounded context خود هست 

## سوال 3: 

بله، می‌توان Docker Compose را یک Orchestration  در نظر گرفت. این ابزار این امکان می‌دهد برنامه‌های چندین کانتینر Docker را تعریف و مدیریت کنیم و خدمات، شبکه‌ها و حجم‌های مورد نیاز برنامه خود را مشخص کنیم. با استفاده از Docker Compose، می‌توان به راحتی برنامه خود را در چندین کانتینر استقرار داده و آن‌ها را به صورت همزمان مدیریت کرد. 



