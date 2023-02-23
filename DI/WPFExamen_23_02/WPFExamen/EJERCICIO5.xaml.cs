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
using System.Windows.Shapes;

namespace WPFExamen
{
    /// <summary>
    /// Lógica de interacción para EJERCICIO5.xaml
    /// </summary>
    public partial class EJERCICIO5 : Window
    {
        public EJERCICIO5()
        {
            InitializeComponent();
        }


        private void Button_Click(object sender, RoutedEventArgs e)
        {
            sliderEJ5.Value += 1;
            Button boton = (Button)sender;
            boton.Background = Brushes.Aqua;
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {          
                sliderEJ5.Value += 1;
                Button boton = (Button)sender;
                boton.Background = Brushes.Aqua;
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            sliderEJ5.Value += 1;
            Button boton = (Button)sender;
            boton.Background = Brushes.Aqua;
        }

        private void Button_Click_3(object sender, RoutedEventArgs e)
        {
            sliderEJ5.Value += 1;
            Button boton = (Button)sender;
            boton.Background = Brushes.Aqua;
        }
    }
}
