using RestSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace ApiPrueba
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

        List<Personajes> listaPersonajes;


        public MainWindow()
        {

            InitializeComponent();
            this.DataContext = listaPersonajes;

            var client = new RestClient("https://harry-potter-api.onrender.com");
            var request = new RestRequest("/personajes", Method.Get);
            listaPersonajes = client.Execute<List<Personajes>>(request).Data;

    

        }



        



        private void btBuscar_Click(object sender, RoutedEventArgs e)
        {
           
            if(SearchBox.Text.Equals( btHarry.Content))
            {
                btHarry.Visibility= Visibility.Visible;
                spHarry.Visibility= Visibility.Visible;
            }       

            if (SearchBox.Text.Equals(btHermione.Content))
            {
                btHermione.Visibility = Visibility.Visible;
                spHermione.Visibility = Visibility.Visible;
            }
            if (SearchBox.Text.Equals(btRon.Content))
            {
                btRon.Visibility = Visibility.Visible;
                spRon.Visibility = Visibility.Visible;
            }
            if (SearchBox.Text.Equals(btGinny.Content))
            {
                btGinny.Visibility = Visibility.Visible;
                spGinny.Visibility = Visibility.Visible;
            }
            if (SearchBox.Text.Equals(btNeville.Content))
            {
                btNeville.Visibility = Visibility.Visible;
                spNev.Visibility = Visibility.Visible;
            }
            if (SearchBox.Text.Equals(btLuna.Content))
            {
                btLuna.Visibility = Visibility.Visible;
                spLuna.Visibility = Visibility.Visible;
            }


        }





        private void btNombre_Click(object sender, RoutedEventArgs e)
        {
           

                tbApodoHarry.Text = "Nombre completo: " + listaPersonajes[0].personaje;
                tbCasaHarry.Text = "Casa de Hogwarts: " + listaPersonajes[0].casaDeHogwarts;
                tbActorHarry.Text = "Actor: " + listaPersonajes[0].interpretado_por;


                // Establecer la imagen como fondo del botón
                var image = new ImageBrush();
                image.ImageSource = new BitmapImage(new Uri(listaPersonajes[0].imagen));
                btHarry.Background = image;
                btHarry.Content = "";
            }

           



        



        private void btHermioneClick(object sender, RoutedEventArgs e)
        {

            tbApodoHermione.Text = "Nombre completo: " + listaPersonajes[1].personaje;
            tbCasaHermione.Text = "Casa de Hogwarts: " + listaPersonajes[1].casaDeHogwarts;
            tbActorHermione.Text = "Actriz: " + listaPersonajes[1].interpretado_por;


            // Establecer la imagen como fondo del botón
            var image = new ImageBrush();
            image.ImageSource = new BitmapImage(new Uri("https://raw.githubusercontent.com/fedeperin/harry-potter-api/main/imagenes/hermione_granger.png"));
            btHermione.Background = image;
            btHermione.Content = "";


        }

        private void btRonClick(object sender, RoutedEventArgs e)
        {
            tbApodoRon.Text = "Nombre completo: " + listaPersonajes[2].personaje;
            tbCasaRon.Text = "Casa de Hogwarts: " + listaPersonajes[2].casaDeHogwarts;
            tbActorRon.Text = "Actor: " + listaPersonajes[2].interpretado_por;


            // Establecer la imagen como fondo del botón
            var image = new ImageBrush();
            image.ImageSource = new BitmapImage(new Uri("https://raw.githubusercontent.com/fedeperin/harry-potter-api/main/imagenes/ron_weasley.png"));
            btRon.Background = image;
            btRon.Content = "";

        }

        private void btGinnyClick(object sender, RoutedEventArgs e)
        {
            tbApodoGinny.Text = "Nombre completo: " + listaPersonajes[8].personaje;
            tbCasaGinny.Text = "Casa de Hogwarts: " + listaPersonajes[8].casaDeHogwarts;
            tbActorGinny.Text = "Actriz: " + listaPersonajes[8].interpretado_por;


            // Establecer la imagen como fondo del botón
            var image = new ImageBrush();
            image.ImageSource = new BitmapImage(new Uri("https://raw.githubusercontent.com/fedeperin/harry-potter-api/main/imagenes/ginny_weasley.png"));
            btGinny.Background = image;
            btGinny.Content = "";

        }

        private void btNevilleClick(object sender, RoutedEventArgs e)
        {
            tbApodoNev.Text = "Nombre completo: " + listaPersonajes[11].personaje;
            tbCasaNev.Text = "Casa de Hogwarts: " + listaPersonajes[11].casaDeHogwarts;
            tbActorNev.Text = "Actor: " + listaPersonajes[11].interpretado_por;


            // Establecer la imagen como fondo del botón
            var image = new ImageBrush();
            image.ImageSource = new BitmapImage(new Uri("https://raw.githubusercontent.com/fedeperin/harry-potter-api/main/imagenes/neville_longbottom.png"));
            btNeville.Background = image;
            btNeville.Content = "";

        }

        private void btLunaClick(object sender, RoutedEventArgs e)
        {
            tbApodoLuna.Text = "Nombre completo: " + listaPersonajes[12].personaje;
            tbCasaLuna.Text = "Casa de Hogwarts: " + listaPersonajes[12].casaDeHogwarts;
            tbActorLuna.Text = "Actriz: " + listaPersonajes[12].interpretado_por;


            // Establecer la imagen como fondo del botón
            var image = new ImageBrush();
            image.ImageSource = new BitmapImage(new Uri("https://raw.githubusercontent.com/fedeperin/harry-potter-api/main/imagenes/luna_lovegood.png"));
            btLuna.Background = image;
            btLuna.Content = "";

        }

        private void SearchBox_GotFocus(object sender, RoutedEventArgs e)
        {
            SearchBox.Text = "";
        }
    }



}











