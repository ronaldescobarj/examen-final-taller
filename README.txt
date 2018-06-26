
Users:

    username    password    role
    jose        jose        ADMIN
    pedro       pedro       user
    mario       mario       user
    antonio     antonio     user

Urls:

    Admin:

    - Admin home -> /admin/restaurants
    - Admin view restaurant -> /admin/restaurant/*
    - Admin edit restaurant -> /admin/restaurant/edit/*
    - Admin add restaurant -> admin/restaurant/new

    Users:
    - Home -> /home, /
    - View restaurant -> /restaurant/*
    - Profile -> user/view/*
    - Create account -> /registration

Uso:

La primera vista es home, que tiene la lista de todos los restaurantes agregados a nuestra base de datos,
para dar like y comentar un restaurante, debes iniciar sesión o crear una cuenta. Para ver un restaurante
solo tienes que hacer clic en su nombre y verás los detalles de ese restaurante, si ya has visitado el restaurante
puedes comentar y calificar el restaurante.
Para acceder a la vista de administrador solo dar en el boton 'Admin' y pedira las credenciales correspondientes.
Solo el administrador puede agregar, editar y eliminar restaurantes de la base de datos.
