namespace WFEjercicios
{
    partial class Ejercicio9NUEVO
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.lbMensajeMail = new System.Windows.Forms.Label();
            this.lbMensajeTelefono = new System.Windows.Forms.Label();
            this.lbMensajeNombre = new System.Windows.Forms.Label();
            this.btValidar = new System.Windows.Forms.Button();
            this.tbTelefono = new System.Windows.Forms.TextBox();
            this.tbMail = new System.Windows.Forms.TextBox();
            this.tbNombre = new System.Windows.Forms.TextBox();
            this.lbMail = new System.Windows.Forms.Label();
            this.lbTelefono = new System.Windows.Forms.Label();
            this.lbNombre = new System.Windows.Forms.Label();
            this.errorProvider1 = new System.Windows.Forms.ErrorProvider(this.components);
            ((System.ComponentModel.ISupportInitialize)(this.errorProvider1)).BeginInit();
            this.SuspendLayout();
            // 
            // lbMensajeMail
            // 
            this.lbMensajeMail.AutoSize = true;
            this.lbMensajeMail.Location = new System.Drawing.Point(262, 243);
            this.lbMensajeMail.Name = "lbMensajeMail";
            this.lbMensajeMail.Size = new System.Drawing.Size(135, 13);
            this.lbMensajeMail.TabIndex = 19;
            this.lbMensajeMail.Text = "(Debe contener un solo @)";
            // 
            // lbMensajeTelefono
            // 
            this.lbMensajeTelefono.AutoSize = true;
            this.lbMensajeTelefono.Location = new System.Drawing.Point(262, 197);
            this.lbMensajeTelefono.Name = "lbMensajeTelefono";
            this.lbMensajeTelefono.Size = new System.Drawing.Size(131, 13);
            this.lbMensajeTelefono.TabIndex = 18;
            this.lbMensajeTelefono.Text = "(Solo se admiten números)";
            // 
            // lbMensajeNombre
            // 
            this.lbMensajeNombre.AutoSize = true;
            this.lbMensajeNombre.Location = new System.Drawing.Point(262, 150);
            this.lbMensajeNombre.Name = "lbMensajeNombre";
            this.lbMensajeNombre.Size = new System.Drawing.Size(174, 13);
            this.lbMensajeNombre.TabIndex = 17;
            this.lbMensajeNombre.Text = "(Solo se admiten letras mayúsculas)";
            // 
            // btValidar
            // 
            this.btValidar.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btValidar.Location = new System.Drawing.Point(550, 292);
            this.btValidar.Name = "btValidar";
            this.btValidar.Size = new System.Drawing.Size(104, 32);
            this.btValidar.TabIndex = 16;
            this.btValidar.Text = "Validar";
            this.btValidar.UseCompatibleTextRendering = true;
            this.btValidar.UseVisualStyleBackColor = true;
            // 
            // tbTelefono
            // 
            this.tbTelefono.Location = new System.Drawing.Point(265, 174);
            this.tbTelefono.Name = "tbTelefono";
            this.tbTelefono.Size = new System.Drawing.Size(203, 20);
            this.tbTelefono.TabIndex = 15;
            this.tbTelefono.TextChanged += new System.EventHandler(this.tbTelefono_TextChanged);
            this.tbTelefono.Validating += new System.ComponentModel.CancelEventHandler(this.tbTelefono_Validating);
            // 
            // tbMail
            // 
            this.tbMail.Location = new System.Drawing.Point(265, 220);
            this.tbMail.Name = "tbMail";
            this.tbMail.Size = new System.Drawing.Size(203, 20);
            this.tbMail.TabIndex = 14;
            this.tbMail.Validating += new System.ComponentModel.CancelEventHandler(this.tbMail_Validating);
            // 
            // tbNombre
            // 
            this.tbNombre.Location = new System.Drawing.Point(265, 127);
            this.tbNombre.Name = "tbNombre";
            this.tbNombre.Size = new System.Drawing.Size(203, 20);
            this.tbNombre.TabIndex = 13;
            this.tbNombre.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.tbNombre_KeyPress);
            // 
            // lbMail
            // 
            this.lbMail.AutoSize = true;
            this.lbMail.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbMail.Location = new System.Drawing.Point(168, 214);
            this.lbMail.Name = "lbMail";
            this.lbMail.Size = new System.Drawing.Size(60, 25);
            this.lbMail.TabIndex = 12;
            this.lbMail.Text = "Email";
            // 
            // lbTelefono
            // 
            this.lbTelefono.AutoSize = true;
            this.lbTelefono.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbTelefono.Location = new System.Drawing.Point(147, 169);
            this.lbTelefono.Name = "lbTelefono";
            this.lbTelefono.Size = new System.Drawing.Size(89, 25);
            this.lbTelefono.TabIndex = 11;
            this.lbTelefono.Text = "Teléfono";
            // 
            // lbNombre
            // 
            this.lbNombre.AutoSize = true;
            this.lbNombre.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbNombre.Location = new System.Drawing.Point(147, 127);
            this.lbNombre.Name = "lbNombre";
            this.lbNombre.Size = new System.Drawing.Size(81, 25);
            this.lbNombre.TabIndex = 10;
            this.lbNombre.Text = "Nombre";
            // 
            // errorProvider1
            // 
            this.errorProvider1.ContainerControl = this;
            // 
            // Ejercicio9NUEVO
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.lbMensajeMail);
            this.Controls.Add(this.lbMensajeTelefono);
            this.Controls.Add(this.lbMensajeNombre);
            this.Controls.Add(this.btValidar);
            this.Controls.Add(this.tbTelefono);
            this.Controls.Add(this.tbMail);
            this.Controls.Add(this.tbNombre);
            this.Controls.Add(this.lbMail);
            this.Controls.Add(this.lbTelefono);
            this.Controls.Add(this.lbNombre);
            this.Name = "Ejercicio9NUEVO";
            this.Text = "Ejercicio9NUEVO";
            ((System.ComponentModel.ISupportInitialize)(this.errorProvider1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbMensajeMail;
        public System.Windows.Forms.Label lbMensajeTelefono;
        private System.Windows.Forms.Label lbMensajeNombre;
        private System.Windows.Forms.Button btValidar;
        private System.Windows.Forms.TextBox tbTelefono;
        private System.Windows.Forms.TextBox tbMail;
        private System.Windows.Forms.TextBox tbNombre;
        private System.Windows.Forms.Label lbMail;
        private System.Windows.Forms.Label lbTelefono;
        private System.Windows.Forms.Label lbNombre;
        private System.Windows.Forms.ErrorProvider errorProvider1;
    }
}