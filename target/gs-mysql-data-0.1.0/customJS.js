Ext.onReady(function () {
    Ext.create('Ext.tab.Panel', {
        renderTo: Ext.getBody(),
        requires: ['Ext.layout.container.Card'],
        xtype: 'layout-cardtabs',
        title: 'Admin Panel',
        width: Ext.getBody().getViewSize().width,
        height: Ext.getBody().getViewSize().height,
        bodyPadding: 10,
        items: [{
                title: 'Book Form',
                items: [ {
                        id:'form',
                        xtype: 'form',
                        title: 'Add new book',
                        defaultType: 'textfield',
                        items: [{
                                fieldLabel: 'Author',
                                name: 'name',
                                allowBlank: false,
                                msgTarget: 'under'
                            }, {
                                fieldLabel: 'Adress Email',
                                name: 'email',
                                vtype: 'email',
                                allowBlank: false,
                                msgTarget: 'under'
                            },{
                        xtype: 'button',
                        id: 'add',
                        text: 'Add Book',
                        handler: function () {
                            if (this.clickCount) {
                                this.clickCount++;
                                alert('You have clicked the button "' + this.clickCount + '" times.\n\nTry clicking it again..');
                            } else {
                                this.clickCount = 1;
                                alert('You just clicked the button for the first time!\n\nTry pressing it again..');
                            }
                        }} ]

                    }, {
                        xtype: 'form',
                        title: 'Update book',
                        defaultType: 'textfield',
                        items: [{
                                fieldLabel: 'ID',
                                name: 'id',
                                allowBlank: false,
                                msgTarget: 'under'
                            },{
                                fieldLabel: 'Name',
                                name: 'name',
                                allowBlank: false,
                                msgTarget: 'under'
                            }, {
                                fieldLabel: 'Adress Email',
                                name: 'email',
                                vtype: 'email',
                                allowBlank: false,
                                msgTarget: 'under'
                            },{
                        xtype: 'button',
                        id: 'update',
                        text: 'Update Book',
                        handler: function () {
                            if (this.clickCount) {
                                this.clickCount++;
                                alert('You have clicked the button "' + this.clickCount + '" times.\n\nTry clicking it again..');
                            } else {
                                this.clickCount = 1;
                                alert('You just clicked the button for the first time!\n\nTry pressing it again..');
                            }
                        }} ]

                    },
                    {title: 'Book Details',
                        xtype: 'grid',
                        store: {
                            fields: ['id', 'author', 'email', 'delete'],
                            data: [
                                {id: '1', author: 'user.',
                                    email: "beckett@example.com"},
                                {id: '2', author: "Kathy Reichs",
                                    email: "reichs@example.com"},
                                {id: '3', author: "Patricia Cornwell",
                                    email: "cornwell@example.com"},
                                {id: '4', author: "Jakub Żulczyk",
                                    email: "zulczyk@example.com"}
                            ],
                            proxy: {
                                type: 'memory'
                            }
                        },
                        columns: [
                            {text: 'N', dataIndex: 'id', flex: 2},
                            {text: 'Author', dataIndex: 'author', flex: 3},
                            {text: 'Email', dataIndex: 'email', flex: 2},
                            {text: 'Delete', dataIndex: 'delete', flex: 2}
                        ]
                    }]
            },
            {
                title: 'User Form'

            }]

    });



});


