using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;
using WFEjercicios.Idiomas;

namespace WFEjercicios
{
    public partial class Ejercicio10 : Form
    {
        public Ejercicio10()
        {
            InitializeComponent();
            //Por defecto está en español
            cbIdiomas.SelectedText = "Español";

        }
        private void btIdioma_Click(object sender, EventArgs e)
        {
            // Al pulsar la opción 0 (español), muestra el mensaje del recurso
            // en español, por defecto
            //else, al pulsar la opción 1(ingles) le pedimos que cambie
            //el idioma y muestre el saludo en ingles

            if (cbIdiomas.SelectedIndex == 0)
            {
                
                MessageBox.Show(recurso.saludo);
            }
            else
            {
                Thread.CurrentThread.CurrentUICulture = new CultureInfo("en-US");
                MessageBox.Show(recurso.saludo);
            }
        }

        private void lbIdioma_Click(object sender, EventArgs e)
        {

        }

        private void cbIdiomas_SelectedIndexChanged(object sender, EventArgs e)
        {
            elegirIdioma();

        }


        //Si en el combobox se escoge la opción 0 le pedimos que modifique a idioma es-ES,
        //else (opcion 1), lo cambia a inglés (en-US)
        private void elegirIdioma()
        {
            if (cbIdiomas.SelectedIndex == 0)
            {
                Thread.CurrentThread.CurrentUICulture = new CultureInfo("es-ES");

            }
            else
            {
                Thread.CurrentThread.CurrentUICulture = new CultureInfo("en-US");

            }

            //Le indicamos que el texto del label es lo que hemos indicado en el archivo llamado recurso
            //En mi caso le he llamado lbIdioma y me indica el idioma
            //Lo mismo para el saludo y para el combobox

            lbIdioma.Text = recurso.lbIdioma;
            btIdioma.Text = recurso.btSaludo;

            cbIdiomas.Items.Clear();    
            cbIdiomas.Items.Add(recurso.cbEspañol);
            cbIdiomas.Items.Add(recurso.cbIngles);
        }

    }
}
