.class public final Ldefpackage/le2;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Ldefpackage/ey;

.field public final m0:Ldefpackage/dc1;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ldefpackage/kc1;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/q5;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ldefpackage/q5;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ldefpackage/cn;

    .line 11
    .line 12
    const/16 v2, 0x16

    .line 13
    .line 14
    invoke-direct {v1, v2, p0}, Ldefpackage/cn;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1, v0}, Ldefpackage/kc1;->W(Ldefpackage/p5;Ldefpackage/su3;)Ldefpackage/dc1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Ldefpackage/le2;->m0:Ldefpackage/dc1;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldefpackage/kc1;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/kc1;->s:Landroid/os/Bundle;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string p1, "single_page_mode"

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const p3, 0x7f0d007b

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const p2, 0x7f0a0128

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    move-object v2, p3

    .line 20
    check-cast v2, Landroid/widget/Button;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const p2, 0x7f0a0129

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    move-object v3, p3

    .line 32
    check-cast v3, Landroid/widget/Button;

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    const p2, 0x7f0a012a

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    move-object v4, p3

    .line 44
    check-cast v4, Landroid/widget/Button;

    .line 45
    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    const p2, 0x7f0a012b

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    move-object v5, p3

    .line 56
    check-cast v5, Landroid/widget/Button;

    .line 57
    .line 58
    if-eqz v5, :cond_0

    .line 59
    .line 60
    const p2, 0x7f0a063f

    .line 61
    .line 62
    .line 63
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    move-object v6, p3

    .line 68
    check-cast v6, Landroid/widget/TextView;

    .line 69
    .line 70
    if-eqz v6, :cond_0

    .line 71
    .line 72
    const p2, 0x7f0a0640

    .line 73
    .line 74
    .line 75
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    move-object v7, p3

    .line 80
    check-cast v7, Landroid/widget/TextView;

    .line 81
    .line 82
    if-eqz v7, :cond_0

    .line 83
    .line 84
    const p2, 0x7f0a0641

    .line 85
    .line 86
    .line 87
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    move-object v8, p3

    .line 92
    check-cast v8, Landroid/widget/TextView;

    .line 93
    .line 94
    if-eqz v8, :cond_0

    .line 95
    .line 96
    const p2, 0x7f0a0642

    .line 97
    .line 98
    .line 99
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    move-object v9, p3

    .line 104
    check-cast v9, Landroid/widget/TextView;

    .line 105
    .line 106
    if-eqz v9, :cond_0

    .line 107
    .line 108
    new-instance v0, Ldefpackage/ey;

    .line 109
    .line 110
    move-object v1, p1

    .line 111
    check-cast v1, Landroid/widget/LinearLayout;

    .line 112
    .line 113
    invoke-direct/range {v0 .. v9}, Ldefpackage/ey;-><init>(Landroid/widget/LinearLayout;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    return-object v1

    .line 122
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    const-string p1, "Missing required view with ID: "

    .line 131
    .line 132
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const/4 p0, 0x0

    .line 140
    return-object p0
.end method

.method public final J()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 6
    .line 7
    return-void
.end method

.method public final P()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/le2;->h0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Ldefpackage/ey;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Landroid/widget/Button;

    .line 12
    .line 13
    new-instance p2, Ldefpackage/ke2;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p2, p0, v0}, Ldefpackage/ke2;-><init>(Ldefpackage/le2;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object p1, p1, Ldefpackage/ey;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Landroid/widget/Button;

    .line 30
    .line 31
    new-instance p2, Ldefpackage/ke2;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-direct {p2, p0, v0}, Ldefpackage/ke2;-><init>(Ldefpackage/le2;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object p1, p1, Ldefpackage/ey;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Landroid/widget/Button;

    .line 48
    .line 49
    new-instance p2, Ldefpackage/ke2;

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    invoke-direct {p2, p0, v0}, Ldefpackage/ke2;-><init>(Ldefpackage/le2;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object p1, p1, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Landroid/widget/Button;

    .line 66
    .line 67
    new-instance p2, Ldefpackage/ke2;

    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    invoke-direct {p2, p0, v0}, Ldefpackage/ke2;-><init>(Ldefpackage/le2;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Ldefpackage/le2;->h0()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final h0()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "android.permission.INTERNET"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ldefpackage/ud3;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    move v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    iget-object v3, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v3, v3, Ldefpackage/ey;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Landroid/widget/TextView;

    .line 26
    .line 27
    const/16 v4, 0x8

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    move v5, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v5, v4

    .line 34
    :goto_1
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    iget-object v3, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v3, v3, Ldefpackage/ey;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Landroid/widget/Button;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    move v0, v4

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v0, v2

    .line 51
    :goto_2
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 55
    .line 56
    const/16 v3, 0x21

    .line 57
    .line 58
    if-lt v0, v3, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    const-string v6, "android.permission.POST_NOTIFICATIONS"

    .line 65
    .line 66
    invoke-static {v5, v6}, Ldefpackage/ud3;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-nez v5, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    move v5, v2

    .line 74
    goto :goto_4

    .line 75
    :cond_4
    :goto_3
    move v5, v1

    .line 76
    :goto_4
    iget-object v6, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object v6, v6, Ldefpackage/ey;->h:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v6, Landroid/widget/TextView;

    .line 84
    .line 85
    if-eqz v5, :cond_5

    .line 86
    .line 87
    move v7, v2

    .line 88
    goto :goto_5

    .line 89
    :cond_5
    move v7, v4

    .line 90
    :goto_5
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 91
    .line 92
    .line 93
    iget-object v6, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v6, v6, Ldefpackage/ey;->d:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v6, Landroid/widget/Button;

    .line 101
    .line 102
    if-eqz v5, :cond_6

    .line 103
    .line 104
    move v5, v4

    .line 105
    goto :goto_6

    .line 106
    :cond_6
    move v5, v2

    .line 107
    :goto_6
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 108
    .line 109
    .line 110
    const/16 v5, 0x25

    .line 111
    .line 112
    if-lt v0, v5, :cond_8

    .line 113
    .line 114
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    const-string v6, "android.permission.ACCESS_LOCAL_NETWORK"

    .line 119
    .line 120
    invoke-static {v5, v6}, Ldefpackage/ud3;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-nez v5, :cond_7

    .line 125
    .line 126
    goto :goto_7

    .line 127
    :cond_7
    move v5, v2

    .line 128
    goto :goto_8

    .line 129
    :cond_8
    :goto_7
    move v5, v1

    .line 130
    :goto_8
    iget-object v6, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 131
    .line 132
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object v6, v6, Ldefpackage/ey;->f:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v6, Landroid/widget/TextView;

    .line 138
    .line 139
    if-eqz v5, :cond_9

    .line 140
    .line 141
    move v7, v2

    .line 142
    goto :goto_9

    .line 143
    :cond_9
    move v7, v4

    .line 144
    :goto_9
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 145
    .line 146
    .line 147
    iget-object v6, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 148
    .line 149
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object v6, v6, Ldefpackage/ey;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v6, Landroid/widget/Button;

    .line 155
    .line 156
    if-eqz v5, :cond_a

    .line 157
    .line 158
    move v5, v4

    .line 159
    goto :goto_a

    .line 160
    :cond_a
    move v5, v2

    .line 161
    :goto_a
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 162
    .line 163
    .line 164
    if-lt v0, v3, :cond_c

    .line 165
    .line 166
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const-string v3, "android.permission.NEARBY_WIFI_DEVICES"

    .line 171
    .line 172
    invoke-static {v0, v3}, Ldefpackage/ud3;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-nez v0, :cond_b

    .line 177
    .line 178
    goto :goto_b

    .line 179
    :cond_b
    move v1, v2

    .line 180
    :cond_c
    :goto_b
    iget-object v0, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object v0, v0, Ldefpackage/ey;->g:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Landroid/widget/TextView;

    .line 188
    .line 189
    if-eqz v1, :cond_d

    .line 190
    .line 191
    move v3, v2

    .line 192
    goto :goto_c

    .line 193
    :cond_d
    move v3, v4

    .line 194
    :goto_c
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 195
    .line 196
    .line 197
    iget-object p0, p0, Ldefpackage/le2;->l0:Ldefpackage/ey;

    .line 198
    .line 199
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    iget-object p0, p0, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p0, Landroid/widget/Button;

    .line 205
    .line 206
    if-eqz v1, :cond_e

    .line 207
    .line 208
    move v2, v4

    .line 209
    :cond_e
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 210
    .line 211
    .line 212
    return-void
.end method
