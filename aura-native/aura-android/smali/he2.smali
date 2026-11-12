.class public final Lhe2;
.super Lee1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic z:Lcom/eddyizm/tempus/ui/login/LoginActivity;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/login/LoginActivity;Lcom/eddyizm/tempus/ui/login/LoginActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhe2;->z:Lcom/eddyizm/tempus/ui/login/LoginActivity;

    .line 2
    .line 3
    invoke-virtual {p2}, Lnc1;->k()Lmd1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p2, Lk70;->n:Lea2;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, Lee1;-><init>(Lld1;Lea2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    const/4 p0, 0x4

    .line 2
    return p0
.end method

.method public final r(I)Lkc1;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "binding"

    .line 3
    .line 4
    const-string v2, "single_page_mode"

    .line 5
    .line 6
    iget-object p0, p0, Lhe2;->z:Lcom/eddyizm/tempus/ui/login/LoginActivity;

    .line 7
    .line 8
    if-eqz p1, :cond_6

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq p1, v3, :cond_4

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq p1, v3, :cond_2

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-eq p1, v3, :cond_0

    .line 18
    .line 19
    iget-boolean p0, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->O:Z

    .line 20
    .line 21
    new-instance p1, Lje2;

    .line 22
    .line 23
    invoke-direct {p1}, Lje2;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v0, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->N:Lna4;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    iget-object p1, p1, Lna4;->p:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 45
    .line 46
    const v0, 0x7f13026b

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    iget-boolean p0, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->O:Z

    .line 57
    .line 58
    new-instance p1, Loe2;

    .line 59
    .line 60
    invoke-direct {p1}, Loe2;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v0, Landroid/os/Bundle;

    .line 64
    .line 65
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v2, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_1
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->N:Lna4;

    .line 80
    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    iget-object p1, p1, Lna4;->p:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 86
    .line 87
    const v0, 0x7f13026c

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    iget-boolean p0, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->O:Z

    .line 98
    .line 99
    new-instance p1, Lre2;

    .line 100
    .line 101
    invoke-direct {p1}, Lre2;-><init>()V

    .line 102
    .line 103
    .line 104
    new-instance v0, Landroid/os/Bundle;

    .line 105
    .line 106
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v2, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v0}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 113
    .line 114
    .line 115
    return-object p1

    .line 116
    :cond_3
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :cond_4
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->N:Lna4;

    .line 121
    .line 122
    if-eqz p1, :cond_5

    .line 123
    .line 124
    iget-object p1, p1, Lna4;->p:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 127
    .line 128
    const v0, 0x7f13026a

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 136
    .line 137
    .line 138
    iget-boolean p0, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->O:Z

    .line 139
    .line 140
    new-instance p1, Lle2;

    .line 141
    .line 142
    invoke-direct {p1}, Lle2;-><init>()V

    .line 143
    .line 144
    .line 145
    new-instance v0, Landroid/os/Bundle;

    .line 146
    .line 147
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v2, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v0}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 154
    .line 155
    .line 156
    return-object p1

    .line 157
    :cond_5
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v0

    .line 161
    :cond_6
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->N:Lna4;

    .line 162
    .line 163
    if-eqz p1, :cond_7

    .line 164
    .line 165
    iget-object p1, p1, Lna4;->p:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 168
    .line 169
    const v0, 0x7f130269

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 177
    .line 178
    .line 179
    iget-boolean p0, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->O:Z

    .line 180
    .line 181
    new-instance p1, Lje2;

    .line 182
    .line 183
    invoke-direct {p1}, Lje2;-><init>()V

    .line 184
    .line 185
    .line 186
    new-instance v0, Landroid/os/Bundle;

    .line 187
    .line 188
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v2, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v0}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 195
    .line 196
    .line 197
    return-object p1

    .line 198
    :cond_7
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v0
.end method
