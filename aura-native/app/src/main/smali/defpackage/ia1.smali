.class public final Ldefpackage/ia1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ha1;


# instance fields
.field public final a:Ldefpackage/pa;

.field public final b:Ldefpackage/zb;

.field public final c:Ldefpackage/wo0;

.field public final d:Ldefpackage/ma1;

.field public final e:Ldefpackage/rm2;


# direct methods
.method public constructor <init>(Ldefpackage/pa;Ldefpackage/zb;)V
    .locals 5

    .line 1
    sget-object v0, Ldefpackage/ja1;->a:Ldefpackage/wo0;

    .line 2
    .line 3
    new-instance v1, Ldefpackage/ma1;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, Ldefpackage/ma1;->a:Ldefpackage/la1;

    .line 9
    .line 10
    sget-object v3, Ldefpackage/qr0;->a:Ldefpackage/fl1;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Ldefpackage/ya4;->F(Ldefpackage/le0;Ldefpackage/ne0;)Ldefpackage/ne0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Ldefpackage/q01;->n:Ldefpackage/q01;

    .line 20
    .line 21
    invoke-interface {v2, v3}, Ldefpackage/ne0;->J(Ldefpackage/ne0;)Ldefpackage/ne0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Ldefpackage/fo4;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-direct {v3, v4}, Ldefpackage/t22;-><init>(Ldefpackage/s22;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v2, v3}, Ldefpackage/ne0;->J(Ldefpackage/ne0;)Ldefpackage/ne0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, Ldefpackage/te5;->a(Ldefpackage/ne0;)Ldefpackage/td0;

    .line 36
    .line 37
    .line 38
    new-instance v2, Ldefpackage/rm2;

    .line 39
    .line 40
    const/4 v3, 0x6

    .line 41
    invoke-direct {v2, v3}, Ldefpackage/rm2;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Ldefpackage/ia1;->a:Ldefpackage/pa;

    .line 48
    .line 49
    iput-object p2, p0, Ldefpackage/ia1;->b:Ldefpackage/zb;

    .line 50
    .line 51
    iput-object v0, p0, Ldefpackage/ia1;->c:Ldefpackage/wo0;

    .line 52
    .line 53
    iput-object v1, p0, Ldefpackage/ia1;->d:Ldefpackage/ma1;

    .line 54
    .line 55
    iput-object v2, p0, Ldefpackage/ia1;->e:Ldefpackage/rm2;

    .line 56
    .line 57
    new-instance p1, Ldefpackage/x;

    .line 58
    .line 59
    const/16 p2, 0xc

    .line 60
    .line 61
    invoke-direct {p1, p2, p0}, Ldefpackage/x;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/m05;)Ldefpackage/n05;
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/ia1;->c:Ldefpackage/wo0;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ldefpackage/xi4;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, v0, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ldefpackage/fg4;

    .line 11
    .line 12
    invoke-virtual {v2, p1}, Ldefpackage/fg4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ldefpackage/n05;

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    iget-boolean v3, v2, Ldefpackage/n05;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    monitor-exit v1

    .line 25
    return-object v2

    .line 26
    :cond_0
    :try_start_1
    iget-object v2, v0, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ldefpackage/fg4;

    .line 29
    .line 30
    iget-object v3, v2, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Ldefpackage/tv1;

    .line 33
    .line 34
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    :try_start_2
    iget-object v4, v2, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, Ldefpackage/si1;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v4, v4, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    invoke-virtual {v4, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    iget v5, v2, Ldefpackage/fg4;->c:I

    .line 53
    .line 54
    add-int/lit8 v5, v5, -0x1

    .line 55
    .line 56
    iput v5, v2, Ldefpackage/fg4;->c:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    :goto_0
    :try_start_3
    monitor-exit v3

    .line 62
    check-cast v4, Ldefpackage/n05;

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :catchall_1
    move-exception p0

    .line 66
    goto :goto_7

    .line 67
    :goto_1
    monitor-exit v3

    .line 68
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 69
    :cond_2
    :goto_2
    monitor-exit v1

    .line 70
    const/4 v1, 0x0

    .line 71
    :try_start_4
    iget-object v2, p0, Ldefpackage/ia1;->d:Ldefpackage/ma1;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, Ldefpackage/ia1;->e:Ldefpackage/rm2;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object v2, p1, Ldefpackage/m05;->a:Ldefpackage/vk0;

    .line 82
    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    instance-of v2, v2, Ldefpackage/vk0;

    .line 86
    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    move-object v2, v1

    .line 91
    goto :goto_4

    .line 92
    :cond_4
    :goto_3
    iget-object p0, p0, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, Ldefpackage/gh3;

    .line 95
    .line 96
    iget-object v2, p1, Ldefpackage/m05;->b:Ldefpackage/gb1;

    .line 97
    .line 98
    iget v3, p1, Ldefpackage/m05;->c:I

    .line 99
    .line 100
    invoke-interface {p0, v2, v3}, Ldefpackage/gh3;->b(Ldefpackage/gb1;I)Landroid/graphics/Typeface;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    new-instance v2, Ldefpackage/n05;

    .line 105
    .line 106
    invoke-direct {v2, p0}, Ldefpackage/n05;-><init>(Landroid/graphics/Typeface;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 107
    .line 108
    .line 109
    :goto_4
    if-eqz v2, :cond_6

    .line 110
    .line 111
    iget-object p0, v0, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p0, Ldefpackage/xi4;

    .line 114
    .line 115
    monitor-enter p0

    .line 116
    :try_start_5
    iget-object v1, v0, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Ldefpackage/fg4;

    .line 119
    .line 120
    invoke-virtual {v1, p1}, Ldefpackage/fg4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-nez v1, :cond_5

    .line 125
    .line 126
    iget-boolean v1, v2, Ldefpackage/n05;->o:Z

    .line 127
    .line 128
    if-eqz v1, :cond_5

    .line 129
    .line 130
    iget-object v0, v0, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Ldefpackage/fg4;

    .line 133
    .line 134
    invoke-virtual {v0, p1, v2}, Ldefpackage/fg4;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 135
    .line 136
    .line 137
    goto :goto_5

    .line 138
    :catchall_2
    move-exception p1

    .line 139
    goto :goto_6

    .line 140
    :cond_5
    :goto_5
    monitor-exit p0

    .line 141
    return-object v2

    .line 142
    :goto_6
    monitor-exit p0

    .line 143
    throw p1

    .line 144
    :cond_6
    :try_start_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 145
    .line 146
    const-string p1, "Could not load font"

    .line 147
    .line 148
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 152
    :catch_0
    move-exception p0

    .line 153
    const-string p1, "Could not load font"

    .line 154
    .line 155
    invoke-static {p1, p0}, Ldefpackage/mj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    return-object v1

    .line 159
    :goto_7
    monitor-exit v1

    .line 160
    throw p0
.end method

.method public final b(Ldefpackage/vk0;Ldefpackage/gb1;II)Ldefpackage/n05;
    .locals 6

    .line 1
    new-instance v0, Ldefpackage/m05;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ia1;->b:Ldefpackage/zb;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, v1, Ldefpackage/zb;->n:I

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const v2, 0x7fffffff

    .line 13
    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget p2, p2, Ldefpackage/gb1;->n:I

    .line 19
    .line 20
    add-int/2addr p2, v1

    .line 21
    const/4 v1, 0x1

    .line 22
    const/16 v2, 0x3e8

    .line 23
    .line 24
    invoke-static {p2, v1, v2}, Ldefpackage/gb;->m(III)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    new-instance v1, Ldefpackage/gb1;

    .line 29
    .line 30
    invoke-direct {v1, p2}, Ldefpackage/gb1;-><init>(I)V

    .line 31
    .line 32
    .line 33
    move-object v2, v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    move-object v2, p2

    .line 36
    :goto_1
    iget-object p2, p0, Ldefpackage/ia1;->a:Ldefpackage/pa;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    move-object v1, p1

    .line 43
    move v3, p3

    .line 44
    move v4, p4

    .line 45
    invoke-direct/range {v0 .. v5}, Ldefpackage/m05;-><init>(Ldefpackage/vk0;Ldefpackage/gb1;IILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ldefpackage/ia1;->a(Ldefpackage/m05;)Ldefpackage/n05;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
