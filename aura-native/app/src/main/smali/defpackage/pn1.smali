.class public final Ldefpackage/pn1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/pn1;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/pn1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a(Landroid/text/Editable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/text/Editable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Landroid/text/Editable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final f(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final g(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final h(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final i(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final j(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final k(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final l(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/pn1;->n:I

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/pn1;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Z

    .line 13
    .line 14
    xor-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->u(ZZ)V

    .line 18
    .line 19
    .line 20
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->n(Landroid/text/Editable;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->v(Landroid/text/Editable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :pswitch_0
    return-void

    .line 35
    :pswitch_1
    check-cast p0, Ldefpackage/eu3;

    .line 36
    .line 37
    invoke-virtual {p0}, Ldefpackage/eu3;->p0()V

    .line 38
    .line 39
    .line 40
    iget-boolean v0, p0, Ldefpackage/eu3;->N0:Z

    .line 41
    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    iget-object v0, p0, Ldefpackage/eu3;->J0:Ldefpackage/w12;

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    if-eqz p1, :cond_3

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :cond_3
    invoke-virtual {p0, v1}, Ldefpackage/eu3;->o0(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    :goto_0
    return-void

    .line 59
    :pswitch_2
    check-cast p0, Ldefpackage/x;

    .line 60
    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_1

    .line 68
    :cond_5
    const/4 p1, 0x0

    .line 69
    :goto_1
    if-nez p1, :cond_6

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_6
    move-object v1, p1

    .line 73
    :goto_2
    invoke-virtual {p0, v1}, Ldefpackage/x;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/pn1;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 8

    .line 1
    iget p3, p0, Ldefpackage/pn1;->n:I

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object p0, p0, Ldefpackage/pn1;->o:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch p3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast p0, Lcom/google/android/material/search/SearchView;

    .line 13
    .line 14
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->x:Landroid/widget/ImageButton;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-lez p1, :cond_0

    .line 21
    .line 22
    move v0, v1

    .line 23
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_1
    check-cast p0, Landroidx/appcompat/widget/SearchView;

    .line 28
    .line 29
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->C:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iput-object p2, p0, Landroidx/appcompat/widget/SearchView;->n0:Ljava/lang/CharSequence;

    .line 36
    .line 37
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    xor-int/lit8 p3, p2, 0x1

    .line 42
    .line 43
    invoke-virtual {p0, p3}, Landroidx/appcompat/widget/SearchView;->v(Z)V

    .line 44
    .line 45
    .line 46
    iget-boolean p3, p0, Landroidx/appcompat/widget/SearchView;->l0:Z

    .line 47
    .line 48
    if-eqz p3, :cond_1

    .line 49
    .line 50
    iget-boolean p3, p0, Landroidx/appcompat/widget/SearchView;->e0:Z

    .line 51
    .line 52
    if-nez p3, :cond_1

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->H:Landroid/widget/ImageView;

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    move v0, v1

    .line 62
    :cond_1
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->J:Landroid/widget/ImageView;

    .line 63
    .line 64
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->r()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->u()V

    .line 71
    .line 72
    .line 73
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->a0:Ldefpackage/u74;

    .line 74
    .line 75
    if-eqz p2, :cond_2

    .line 76
    .line 77
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->m0:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-nez p2, :cond_2

    .line 84
    .line 85
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->a0:Ldefpackage/u74;

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    invoke-interface {p2, p3}, Ldefpackage/u74;->onQueryTextChange(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->m0:Ljava/lang/String;

    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_2
    add-int/2addr p2, p4

    .line 102
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;

    .line 103
    .line 104
    const/4 p3, 0x1

    .line 105
    if-le p2, p3, :cond_4

    .line 106
    .line 107
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->n0:Ldefpackage/d84;

    .line 112
    .line 113
    iget-object p1, p1, Ldefpackage/d84;->c:Ldefpackage/rm2;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    new-instance p1, Ldefpackage/k03;

    .line 119
    .line 120
    invoke-direct {p1}, Ldefpackage/ad2;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    iget-object p3, p2, Ldefpackage/pn4;->g:Ldefpackage/hd5;

    .line 128
    .line 129
    if-nez p3, :cond_3

    .line 130
    .line 131
    new-instance p3, Ldefpackage/hd5;

    .line 132
    .line 133
    invoke-direct {p3, p2}, Ldefpackage/hd5;-><init>(Ldefpackage/pn4;)V

    .line 134
    .line 135
    .line 136
    iput-object p3, p2, Ldefpackage/pn4;->g:Ldefpackage/hd5;

    .line 137
    .line 138
    :cond_3
    iget-object v2, p2, Ldefpackage/pn4;->g:Ldefpackage/hd5;

    .line 139
    .line 140
    const/4 v6, 0x5

    .line 141
    const/4 v7, 0x5

    .line 142
    const/4 v4, 0x5

    .line 143
    const/4 v5, 0x0

    .line 144
    invoke-virtual/range {v2 .. v7}, Ldefpackage/hd5;->m(Ljava/lang/String;IIII)Lretrofit2/Call;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    new-instance p3, Ldefpackage/p8;

    .line 149
    .line 150
    const/4 p4, 0x4

    .line 151
    invoke-direct {p3, p1, p4}, Ldefpackage/p8;-><init>(Ldefpackage/k03;I)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p2, p3}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    new-instance p3, Ldefpackage/k74;

    .line 162
    .line 163
    const/4 p4, 0x2

    .line 164
    invoke-direct {p3, p0, p4}, Ldefpackage/k74;-><init>(Lcom/eddyizm/tempus/ui/fragment/SearchFragment;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, p2, p3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_4
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->i0()V

    .line 172
    .line 173
    .line 174
    :goto_0
    :pswitch_3
    return-void

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
