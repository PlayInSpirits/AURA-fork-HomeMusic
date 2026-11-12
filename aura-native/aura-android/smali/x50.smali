.class public final synthetic Lx50;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lba1;Lba1;Ljava/lang/Object;ILdd0;I)V
    .locals 0

    .line 18
    iput p6, p0, Lx50;->n:I

    iput-object p1, p0, Lx50;->p:Ljava/lang/Object;

    iput-object p2, p0, Lx50;->q:Ljava/lang/Object;

    iput-object p3, p0, Lx50;->r:Ljava/lang/Object;

    iput p4, p0, Lx50;->o:I

    iput-object p5, p0, Lx50;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>([Ljg3;Ly50;ILcf2;[I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lx50;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lx50;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lx50;->q:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Lx50;->o:I

    .line 12
    .line 13
    iput-object p4, p0, Lx50;->r:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lx50;->s:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lx50;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lx50;->s:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, Lx50;->o:I

    .line 7
    .line 8
    iget-object v4, p0, Lx50;->r:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, p0, Lx50;->q:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Lx50;->p:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Lba1;

    .line 18
    .line 19
    check-cast v5, Lba1;

    .line 20
    .line 21
    check-cast v4, Lwv3;

    .line 22
    .line 23
    check-cast v2, Ldd0;

    .line 24
    .line 25
    check-cast p1, Les;

    .line 26
    .line 27
    invoke-static {v5}, Lj51;->P(Leo0;)Lub3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lra;

    .line 32
    .line 33
    invoke-virtual {v0}, Lra;->getFocusOwner()Lu91;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ley;

    .line 38
    .line 39
    invoke-virtual {v0}, Ley;->f()Lba1;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eq p0, v0, :cond_0

    .line 44
    .line 45
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v3, v2, v5, v4}, Lkb4;->R(ILdd0;Lba1;Lwv3;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez p0, :cond_1

    .line 57
    .line 58
    invoke-interface {p1}, Les;->a()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_2

    .line 63
    .line 64
    :cond_1
    move-object v1, v0

    .line 65
    :cond_2
    :goto_0
    return-object v1

    .line 66
    :pswitch_0
    check-cast p0, Lba1;

    .line 67
    .line 68
    check-cast v5, Lba1;

    .line 69
    .line 70
    check-cast v4, Lba1;

    .line 71
    .line 72
    check-cast v2, Ldd0;

    .line 73
    .line 74
    check-cast p1, Les;

    .line 75
    .line 76
    invoke-static {v5}, Lj51;->P(Leo0;)Lub3;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lra;

    .line 81
    .line 82
    invoke-virtual {v0}, Lra;->getFocusOwner()Lu91;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ley;

    .line 87
    .line 88
    invoke-virtual {v0}, Ley;->f()Lba1;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eq p0, v0, :cond_3

    .line 93
    .line 94
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    invoke-static {v5, v4, v3, v2}, Lzz1;->H(Lba1;Lba1;ILdd0;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-nez p0, :cond_4

    .line 106
    .line 107
    invoke-interface {p1}, Les;->a()Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-nez p0, :cond_5

    .line 112
    .line 113
    :cond_4
    move-object v1, v0

    .line 114
    :cond_5
    :goto_1
    return-object v1

    .line 115
    :pswitch_1
    check-cast p0, [Ljg3;

    .line 116
    .line 117
    check-cast v5, Ly50;

    .line 118
    .line 119
    check-cast v4, Lcf2;

    .line 120
    .line 121
    check-cast v2, [I

    .line 122
    .line 123
    check-cast p1, Lig3;

    .line 124
    .line 125
    array-length v0, p0

    .line 126
    const/4 v1, 0x0

    .line 127
    move v6, v1

    .line 128
    :goto_2
    if-ge v1, v0, :cond_6

    .line 129
    .line 130
    aget-object v7, p0, v1

    .line 131
    .line 132
    add-int/lit8 v8, v6, 0x1

    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7}, Ljg3;->t()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    invoke-interface {v4}, Lwi2;->getLayoutDirection()Lr62;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    iget-object v10, v5, Ly50;->a:Lfs;

    .line 145
    .line 146
    iget v11, v7, Ljg3;->n:I

    .line 147
    .line 148
    invoke-virtual {v10, v11, v3, v9}, Lfs;->a(IILr62;)I

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    aget v6, v2, v6

    .line 153
    .line 154
    invoke-static {p1, v7, v9, v6}, Lig3;->f(Lig3;Ljg3;II)V

    .line 155
    .line 156
    .line 157
    add-int/lit8 v1, v1, 0x1

    .line 158
    .line 159
    move v6, v8

    .line 160
    goto :goto_2

    .line 161
    :cond_6
    sget-object p0, Lj15;->a:Lj15;

    .line 162
    .line 163
    return-object p0

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
