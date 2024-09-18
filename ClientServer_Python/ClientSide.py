
from socket import create_connection

#Port allocation
server_endpoint = ('localhost',1234)

with create_connection(server_endpoint) as socket:
    #I/0 Client receives
    message = socket.recv(20).decode()
    print(message)
