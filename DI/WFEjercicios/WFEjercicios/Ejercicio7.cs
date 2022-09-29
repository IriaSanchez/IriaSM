using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFEjercicios
{
    public partial class Ejercicio7 : Form
    {

        //Creamos el objeto alumno a nivel de formulario

        BindingList <Alumno> listado = new BindingList<Alumno>();

        public Ejercicio7()
        {
            InitializeComponent();
        }




        private void Ejercicio7_Load(object sender, EventArgs e)
        {
            //Añadimos datos A MANO al objeto llamado listado

            listado.Add(new Alumno
            {
                Nombre = "Iria",
                Edad = 34,
                Alta = DateTime.Parse("5/12/20"),
                Comedor = true,
                Turno = "Mañana"

            });
               
            //Lo añadimos a la tabla para poder verlos (al DataGridView) a nivel de carga (load)

            DGVAlumnos.DataSource = listado;
        }


        //Para que cada vez que se cubra el formulario y se pulse el botón añadir, la información pase al
        //DataGridView

        private void btAñadir_Click(object sender, EventArgs e)
        {
            if (tbNombre.Text == ""){
                MessageBox.Show("El campo no puede estar vacío.");

            }if (tbEdad.Text == "") {
                MessageBox.Show("El campo no puede estar vacío.");

            } else {

                Alumno objeto = new Alumno
                {
                    Nombre = tbNombre.Text,
                    Edad = Int32.Parse(tbEdad.Text),
                    Alta = DTPFecha.Value.Date,
                    Comedor = checkComedor.Checked,
                    Turno = cbTurno.Text
                };

                //Añadir los datos al array listado.

                listado.Add(objeto);

            }
        }

        //En el botón de eliminar añadimos el .clear
         private void btEliminar_Click(object sender, EventArgs e)
          {
           listado.Clear();
           }



        private void tbEdad_TextChanged(object sender, EventArgs e)
        {

            //Creamos un boolean para comprobar si la conversión fue OK o no.
            //Le pasamos el texto que escribe el usuario en el textbox y se añade una segunda variable
            ////que es obligatoria aunque no vamos a usarla

            int edad = 0;
            bool conversionOK = Int32.TryParse(tbEdad.Text, out edad);

            //En el if le decimos que si la conversion no es ok, nos imprima un mensaje para no poder continuar hasta que no escriba un número

            
            if (!conversionOK)
            {

                MessageBox.Show("Debes introducir un número");
            }
        }


















        private void DTPFecha_ValueChanged(object sender, EventArgs e)
        {

        }

        private void panel2_Paint(object sender, PaintEventArgs e)
        {

        }

        private void DGVAlumnos_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void tbNombre_TextChanged(object sender, EventArgs e)
        {

            
        }



     
    }
}
