using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace WFEjercicios
{
    public partial class Ejercicio9 : Form
    {
        public Ejercicio9()
        {
            InitializeComponent();
        }

        private void lbNombre_Click(object sender, EventArgs e)
        {

        }

        private void btValidar_Click(object sender, EventArgs e)
        {

            errorProvider1.Clear();
            //Si el texto que hay en el tbNombre en mayusculas (toUpper) es distinto que el texto del tbNombre,
            //entonces saldrá el mensaje de error

            if (tbNombre.Text.ToUpper() != tbNombre.Text)
            {

                errorProvider1.SetError(tbNombre, "Las letras deben ser mayúsculas");

            }

            //Variable para almacenar el teléfono y boolean que comprueba si son numeros,
            //se le da como salida la variable declarada int telefono

            int telefono = 0;
            bool comprobar = Int32.TryParse(tbTelefono.Text, out telefono);

            //Si es falso, sale mensaje de error

            if (comprobar == false)
            {
                errorProvider1.SetError(tbTelefono, "Deben ser números");

            }

            //Comprobamos el simbolo @ y añadimos contador

            int cantArrobas = 0;

            foreach (char c in tbMail.Text)
            {

                if (c == '@')
                {

                    cantArrobas++;
                }
            }


            //Comprobamos cantidad de @

            if (cantArrobas == 1)
            {

            }
            else if (cantArrobas == 0)
            {

                errorProvider1.SetError(tbMail, "Debe contener al menos una @");
            }

            else
            {
                errorProvider1.SetError(tbMail, "No puede contener mas de una @");
            }




            
        }
            private void tbNombre_TextChanged_1(object sender, EventArgs e){

                 }

    }
}

