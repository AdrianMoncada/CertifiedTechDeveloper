#1. Listar todos los países que contengan la letra A, ordenada alfabéticamente.

SELECT * 
FROM pais
WHERE pais.nombre like '%A%';

#2. Generar un listado de los usuarios, con el detalle de todos sus datos, el avatar que poseen y a qué país pertenecen
SELECT usuario.nombre AS userName, pais.nombre AS countryName, avatar.nombre AS avatarName
FROM usuario
LEFT JOIN pais 
ON usuario.Pais_idPais = pais.idPais
LEFT JOIN avatar
ON usuario.Avatar_idAvatar = avatar.idAvatar;

# 3. Confeccionar un listado con los usuarios que tienen playlists, mostrando la cantidad que poseen
SELECT usuario.nombre AS userName,COUNT(playlist.idPlaylist) AS playlistCount
FROM usuario
RIGHT JOIN playlist
ON usuario.idUsuario = playlist.Usuario_idUsuario
GROUP BY usuario.nombre;

#4. Mostrar todos los canales creados entre el 01/04/2021 y el 01/06/2021.
SELECT canal.nombre AS channelName
FROM canal
WHERE fechaCreacion BETWEEN '2021-04-01 00:00:00' AND '2021-06-01 00:00:00';

# 5. Mostrar los 5 videos de menor duración, listando el título del vídeo, la o las etiquetas que poseen, el nombre de usuario y país al que corresponden.
SELECT *
from video
ORDER BY video.duracion ;







