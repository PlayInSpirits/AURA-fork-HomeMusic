.class public Lcom/eddyizm/tempus/ui/crash/CrashActivity;
.super Ldf;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic T:I


# instance fields
.field public N:Ljava/lang/String;

.field public O:Loz;

.field public P:Landroidx/appcompat/widget/Toolbar;

.field public Q:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

.field public R:Landroidx/drawerlayout/widget/DrawerLayout;

.field public S:Lcom/google/android/material/navigation/NavigationView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldf;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ltj4;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Ltj4;-><init>(Ldf;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Lpz1;

    .line 14
    .line 15
    const/16 v1, 0x18

    .line 16
    .line 17
    invoke-direct {v0, v1, p0}, Lpz1;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0}, Lpz1;->v()V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lgp3;

    .line 24
    .line 25
    const/4 v1, 0x7

    .line 26
    invoke-direct {v0, v1}, Lgp3;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lqr2;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lqr2;-><init>(Lgp3;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v1}, Lly0;->a(Ldf;Lqr2;)V

    .line 35
    .line 36
    .line 37
    invoke-super {p0, p1}, Lnc1;->onCreate(Landroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const v0, 0x7f0d001c

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const v1, 0x7f0a0183

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 61
    .line 62
    const v3, 0x7f0a0184

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Landroid/widget/FrameLayout;

    .line 70
    .line 71
    if-eqz v4, :cond_5

    .line 72
    .line 73
    move-object v4, p1

    .line 74
    check-cast v4, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 75
    .line 76
    const v5, 0x7f0a018c

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    check-cast v6, Lcom/google/android/material/navigation/NavigationView;

    .line 84
    .line 85
    const v6, 0x7f0a018d

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v6}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    check-cast v7, Landroidx/appcompat/widget/Toolbar;

    .line 93
    .line 94
    if-eqz v7, :cond_4

    .line 95
    .line 96
    invoke-virtual {p0, v4}, Ldf;->setContentView(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    sget-object v4, Lsg0;->a:Landroid/app/Application;

    .line 104
    .line 105
    const-string v4, "cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"

    .line 106
    .line 107
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->N:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p1}, Lsg0;->c(Landroid/content/Intent;)Loz;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->O:Loz;

    .line 122
    .line 123
    invoke-static {p0}, Lxy0;->a(Ldf;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Ldf;->setContentView(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v6}, Ldf;->findViewById(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 134
    .line 135
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->P:Landroidx/appcompat/widget/Toolbar;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, Ldf;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v3}, Ldf;->findViewById(I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    check-cast p1, Landroid/widget/FrameLayout;

    .line 145
    .line 146
    invoke-virtual {p0, v1}, Ldf;->findViewById(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 151
    .line 152
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->Q:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 153
    .line 154
    const p1, 0x7f0a0185

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, p1}, Ldf;->findViewById(I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 162
    .line 163
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->R:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 164
    .line 165
    invoke-virtual {p0, v5}, Ldf;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Lcom/google/android/material/navigation/NavigationView;

    .line 170
    .line 171
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->S:Lcom/google/android/material/navigation/NavigationView;

    .line 172
    .line 173
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->Q:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 174
    .line 175
    const/4 v0, 0x2

    .line 176
    const v1, 0x7f0a018a

    .line 177
    .line 178
    .line 179
    if-eqz p1, :cond_1

    .line 180
    .line 181
    new-instance v3, Lcn;

    .line 182
    .line 183
    invoke-direct {v3, v0, p0}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v3}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->setOnNavigationItemSelectedListener(Lst;)V

    .line 187
    .line 188
    .line 189
    new-instance v3, Lif0;

    .line 190
    .line 191
    invoke-direct {v3}, Lif0;-><init>()V

    .line 192
    .line 193
    .line 194
    const-string v4, "Crash Landing"

    .line 195
    .line 196
    invoke-virtual {p0, v3, v4}, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->p(Lkc1;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Ls33;->getMenu()Landroid/view/Menu;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    const/4 v3, 0x1

    .line 208
    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 209
    .line 210
    .line 211
    :cond_1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->R:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 212
    .line 213
    if-eqz p1, :cond_2

    .line 214
    .line 215
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->S:Lcom/google/android/material/navigation/NavigationView;

    .line 216
    .line 217
    if-eqz v3, :cond_2

    .line 218
    .line 219
    new-instance v4, Lef0;

    .line 220
    .line 221
    invoke-direct {v4, v2, p0, p1}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationView;->setNavigationItemSelectedListener(Lq43;)V

    .line 225
    .line 226
    .line 227
    new-instance p1, Lif0;

    .line 228
    .line 229
    invoke-direct {p1}, Lif0;-><init>()V

    .line 230
    .line 231
    .line 232
    const v2, 0x7f13009e

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {p0, p1, v2}, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->p(Lkc1;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3, v1}, Lcom/google/android/material/navigation/NavigationView;->setCheckedItem(I)V

    .line 243
    .line 244
    .line 245
    :cond_2
    invoke-virtual {p0}, Ldf;->getResources()Landroid/content/res/Resources;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 254
    .line 255
    if-ne p1, v0, :cond_3

    .line 256
    .line 257
    new-instance p1, Lk4;

    .line 258
    .line 259
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->R:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 260
    .line 261
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->P:Landroidx/appcompat/widget/Toolbar;

    .line 262
    .line 263
    invoke-direct {p1, p0, v0, v1}, Lk4;-><init>(Ldf;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;)V

    .line 264
    .line 265
    .line 266
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->R:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 267
    .line 268
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->a(Lgw0;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1}, Lk4;->e()V

    .line 272
    .line 273
    .line 274
    :cond_3
    return-void

    .line 275
    :cond_4
    move v3, v6

    .line 276
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    const-string p1, "Missing required view with ID: "

    .line 285
    .line 286
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    return-void
.end method

.method public final p(Lkc1;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldf;->n()Ll93;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p2}, Ll93;->k0(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance p2, Lpo;

    .line 19
    .line 20
    invoke-direct {p2, p0}, Lpo;-><init>(Lld1;)V

    .line 21
    .line 22
    .line 23
    const p0, 0x7f0a0184

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p2, p0, p1, v0}, Lpo;->j(ILkc1;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    iput-boolean p0, p2, Lpo;->p:Z

    .line 32
    .line 33
    invoke-virtual {p2, v0}, Lpo;->c(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    invoke-virtual {p2, p0}, Lpo;->e(Z)I

    .line 38
    .line 39
    .line 40
    return-void
.end method
