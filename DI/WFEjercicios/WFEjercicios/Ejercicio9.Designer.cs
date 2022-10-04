using System;

namespace WFEjercicios
{
    partial class Ejercicio9
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
            this.lbNombre = new System.Windows.Forms.Label();
            this.lbTelefono = new System.Windows.Forms.Label();
            this.lbMail = new System.Windows.Forms.Label();
            this.tbNombre = new System.Windows.Forms.TextBox();
            this.tbMail = new System.Windows.Forms.TextBox();
            this.tbTelefono = new System.Windows.Forms.TextBox();
            this.btValidar = new System.Windows.Forms.Button();
            this.lbMensajeNombre = new System.Windows.Forms.Label();
            this.lbMensajeTelefono = new System.Windows.Forms.Label();
            this.lbMensajeMail = new System.Windows.Forms.Label();
            this.errorProvider1 = new System.Windows.Forms.ErrorProvider(this.components);
            ((System.ComponentModel.ISupportInitialize)(this.errorProvider1)).BeginInit();
            this.SuspendLayout();
            // 
            // lbNombre
            // 
            this.lbNombre.AutoSize = true;
            this.lbNombre.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbNombre.Location = new System.Drawing.Point(205, 123);
            this.lbNombre.Name = "lbNombre";
            this.lbNombre.Size = new System.Drawing.Size(81, 25);
            this.lbNombre.TabIndex = 0;
            this.lbNombre.Text = "Nombre";
            // 
            // lbTelefono
            // 
            this.lbTelefono.AutoSize = true;
            this.lbTelefono.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbTelefono.Location = new System.Drawing.Point(205, 165);
            this.lbTelefono.Name = "lbTelefono";
            this.lbTelefono.Size = new System.Drawing.Size(89, 25);
            this.lbTelefono.TabIndex = 1;
            this.lbTelefono.Text = "Teléfono";
            // 
            // lbMail
            // 
            this.lbMail.AutoSize = true;
            this.lbMail.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbMail.Location = new System.Drawing.Point(226, 210);
            this.lbMail.Name = "lbMail";
            this.lbMail.Size = new System.Drawing.Size(60, 25);
            this.lbMail.TabIndex = 2;
            this.lbMail.Text = "Email";
            // 
            // tbNombre
            // 
            this.tbNombre.Location = new System.Drawing.Point(323, 123);
            this.tbNombre.Name = "tbNombre";
            this.tbNombre.Size = new System.Drawing.Size(203, 20);
            this.tbNombre.TabIndex = 3;
            this.tbNombre.TextChanged += new System.EventHandler(this.tbNombre_TextChanged_1);
            // 
            // tbMail
            // 
            this.tbMail.Location = new System.Drawing.Point(323, 216);
            this.tbMail.Name = "tbMail";
            this.tbMail.Size = new System.Drawing.Size(203, 20);
            this.tbMail.TabIndex = 4;
            // 
            // tbTelefono
            // 
            this.tbTelefono.Location = new System.Drawing.Point(323, 170);
            this.tbTelefono.Name = "tbTelefono";
            this.tbTelefono.Size = new System.Drawing.Size(203, 20);
            this.tbTelefono.TabIndex = 5;
            // 
            // btValidar
            // 
            this.btValidar.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btValidar.Location = new System.Drawing.Point(608, 288);
            this.btValidar.Name = "btValidar";
            this.btValidar.Size = new System.Drawing.Size(104, 32);
            this.btValidar.TabIndex = 6;
            this.btValidar.Text = "Validar";
            this.btValidar.UseCompatibleTextRendering = true;
            this.btValidar.UseVisualStyleBackColor = true;
            this.btValidar.Click += new System.EventHandler(this.btValidar_Click);
            // 
            // lbMensajeNombre
            // 
            this.lbMensajeNombre.AutoSize = true;
            this.lbMensajeNombre.Location = new System.Drawing.Point(320, 146);
            this.lbMensajeNombre.Name = "lbMensajeNombre";
            this.lbMensajeNombre.Size = new System.Drawing.Size(174, 13);
            this.lbMensajeNombre.TabIndex = 7;
            this.lbMensajeNombre.Text = "(Solo se admiten letras mayúsculas)";
            this.lbMensajeNombre.Click += new System.EventHandler(this.lbNombre_Click);
            // 
            // lbMensajeTelefono
            // 
            this.lbMensajeTelefono.AutoSize = true;
            this.lbMensajeTelefono.Location = new System.Drawing.Point(320, 193);
            this.lbMensajeTelefono.Name = "lbMensajeTelefono";
            this.lbMensajeTelefono.Size = new System.Drawing.Size(131, 13);
            this.lbMensajeTelefono.TabIndex = 8;
            this.lbMensajeTelefono.Text = "(Solo se admiten números)";
            // 
            // lbMensajeMail
            // 
            this.lbMensajeMail.AutoSize = true;
            this.lbMensajeMail.Location = new System.Drawing.Point(320, 239);
            this.lbMensajeMail.Name = "lbMensajeMail";
            this.lbMensajeMail.Size = new System.Drawing.Size(135, 13);
            this.lbMensajeMail.TabIndex = 9;
            this.lbMensajeMail.Text = "(Debe contener un solo @)";
            // 
            // errorProvider1
            // 
            this.errorProvider1.ContainerControl = this;
            // 
            // Ejercicio9
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
            this.Name = "Ejercicio9";
            this.Text = "Ejercicio9";
            ((System.ComponentModel.ISupportInitialize)(this.errorProvider1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbNombre;
        private System.Windows.Forms.Label lbTelefono;
        private System.Windows.Forms.Label lbMail;
        private System.Windows.Forms.TextBox tbNombre;
        private System.Windows.Forms.TextBox tbMail;
        private System.Windows.Forms.TextBox tbTelefono;
        private System.Windows.Forms.Button btValidar;
        private System.Windows.Forms.Label lbMensajeNombre;
        private System.Windows.Forms.Label lbMensajeMail;
        public System.Windows.Forms.Label lbMensajeTelefono;
        private System.Windows.Forms.ErrorProvider errorProvider1;
        private EventHandler tbNombre_TextChanged;
    }
}