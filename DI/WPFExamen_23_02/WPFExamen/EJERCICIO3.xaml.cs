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
    /// Lógica de interacción para EJERCICIO3.xaml
    /// </summary>
    public partial class EJERCICIO3 : Window
    {
        public EJERCICIO3()
        {
            InitializeComponent();
        }

        private void btDecrementar_Click(object sender, RoutedEventArgs e)
        {
            if (pb_ej3.Value>pb_ej3.Minimum)
            {
                pb_ej3.Value -= 1;
            }
        }

        private void btIncrementar_Click(object sender, RoutedEventArgs e)
        {
            if(pb_ej3.Value<pb_ej3.Maximum)
            {
                pb_ej3.Value += 1;
            }
        }
    }
}
