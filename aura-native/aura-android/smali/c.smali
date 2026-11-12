.class public final Lc;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/reflect/WildcardType;
.implements Ljava/io/Serializable;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;

.field public final p:Ljava/lang/Object;


# direct methods
.method public constructor <init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;I)V
    .locals 2

    .line 1
    iput p3, p0, Lc;->n:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    array-length p3, p2

    .line 10
    const/4 v0, 0x0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-gt p3, v1, :cond_0

    .line 13
    .line 14
    move p3, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p3, v0

    .line 17
    :goto_0
    invoke-static {p3}, Lvr1;->d(Z)V

    .line 18
    .line 19
    .line 20
    array-length p3, p1

    .line 21
    if-ne p3, v1, :cond_1

    .line 22
    .line 23
    move p3, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move p3, v0

    .line 26
    :goto_1
    invoke-static {p3}, Lvr1;->d(Z)V

    .line 27
    .line 28
    .line 29
    array-length p3, p2

    .line 30
    if-ne p3, v1, :cond_3

    .line 31
    .line 32
    aget-object p3, p2, v0

    .line 33
    .line 34
    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    aget-object p3, p2, v0

    .line 38
    .line 39
    invoke-static {p3}, Lgb;->i(Ljava/lang/reflect/Type;)V

    .line 40
    .line 41
    .line 42
    aget-object p1, p1, v0

    .line 43
    .line 44
    const-class p3, Ljava/lang/Object;

    .line 45
    .line 46
    if-ne p1, p3, :cond_2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v1, v0

    .line 50
    :goto_2
    invoke-static {v1}, Lvr1;->d(Z)V

    .line 51
    .line 52
    .line 53
    aget-object p1, p2, v0

    .line 54
    .line 55
    invoke-static {p1}, Lgb;->h(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lc;->p:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object p3, p0, Lc;->o:Ljava/lang/Object;

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    aget-object p2, p1, v0

    .line 65
    .line 66
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    aget-object p2, p1, v0

    .line 70
    .line 71
    invoke-static {p2}, Lgb;->i(Ljava/lang/reflect/Type;)V

    .line 72
    .line 73
    .line 74
    const/4 p2, 0x0

    .line 75
    iput-object p2, p0, Lc;->p:Ljava/lang/Object;

    .line 76
    .line 77
    aget-object p1, p1, v0

    .line 78
    .line 79
    invoke-static {p1}, Lgb;->h(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lc;->o:Ljava/lang/Object;

    .line 84
    .line 85
    :goto_3
    return-void

    .line 86
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string p3, "lower bound for wildcard"

    .line 90
    .line 91
    invoke-static {p1, p3}, Lb15;->b([Ljava/lang/reflect/Type;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string p3, "upper bound for wildcard"

    .line 95
    .line 96
    invoke-static {p2, p3}, Lb15;->b([Ljava/lang/reflect/Type;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sget-object p3, Lx05;->p:Lx05;

    .line 100
    .line 101
    invoke-virtual {p3, p1}, Lx05;->c([Ljava/lang/reflect/Type;)Lgy3;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, p0, Lc;->o:Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {p3, p2}, Lx05;->c([Ljava/lang/reflect/Type;)Lgy3;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, p0, Lc;->p:Ljava/lang/Object;

    .line 112
    .line 113
    return-void

    .line 114
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget v0, p0, Lc;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    instance-of v0, p1, Ljava/lang/reflect/WildcardType;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, Ljava/lang/reflect/WildcardType;

    .line 13
    .line 14
    iget-object v0, p0, Lc;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lgy3;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v0, v3}, Lyw1;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object p0, p0, Lc;->p:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Lgy3;

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, Lyw1;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move v1, v2

    .line 52
    :goto_0
    return v1

    .line 53
    :pswitch_0
    instance-of v0, p1, Ljava/lang/reflect/WildcardType;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    check-cast p1, Ljava/lang/reflect/WildcardType;

    .line 58
    .line 59
    invoke-static {p0, p1}, Lgb;->v(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move v1, v2

    .line 67
    :goto_1
    return v1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getLowerBounds()[Ljava/lang/reflect/Type;
    .locals 2

    .line 1
    iget v0, p0, Lc;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lc;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lgy3;

    .line 10
    .line 11
    sget-object v0, Lb15;->a:Lc32;

    .line 12
    .line 13
    new-array v0, v1, [Ljava/lang/reflect/Type;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lrw1;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, [Ljava/lang/reflect/Type;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    iget-object p0, p0, Lc;->p:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Ljava/lang/reflect/Type;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 30
    .line 31
    aput-object p0, v0, v1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget-object v0, Lgb;->a:[Ljava/lang/reflect/Type;

    .line 35
    .line 36
    :goto_0
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getUpperBounds()[Ljava/lang/reflect/Type;
    .locals 2

    .line 1
    iget v0, p0, Lc;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lc;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lgy3;

    .line 10
    .line 11
    sget-object v0, Lb15;->a:Lc32;

    .line 12
    .line 13
    new-array v0, v1, [Ljava/lang/reflect/Type;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lrw1;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, [Ljava/lang/reflect/Type;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    iget-object p0, p0, Lc;->o:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Ljava/lang/reflect/Type;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 28
    .line 29
    aput-object p0, v0, v1

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lc;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lc;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lc;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lgy3;

    .line 11
    .line 12
    invoke-virtual {p0}, Lyw1;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    check-cast v1, Lgy3;

    .line 17
    .line 18
    invoke-virtual {v1}, Lyw1;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    xor-int/2addr p0, v0

    .line 23
    return p0

    .line 24
    :pswitch_0
    check-cast v1, Ljava/lang/reflect/Type;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/lit8 v0, v0, 0x1f

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v0, 0x1

    .line 36
    :goto_0
    check-cast p0, Ljava/lang/reflect/Type;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    add-int/lit8 p0, p0, 0x1f

    .line 43
    .line 44
    xor-int/2addr p0, v0

    .line 45
    return p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lc;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lc;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lc;->o:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v2, "?"

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p0, Lgy3;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {p0, v2}, Lyw1;->m(I)Lvw1;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-virtual {p0}, Lv0;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lv0;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/reflect/Type;

    .line 35
    .line 36
    const-string v3, " super "

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    sget-object v3, Lx05;->p:Lx05;

    .line 42
    .line 43
    invoke-virtual {v3, v2}, Lx05;->b(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    check-cast v1, Lgy3;

    .line 52
    .line 53
    sget-object p0, Lb15;->a:Lc32;

    .line 54
    .line 55
    new-instance p0, Lto3;

    .line 56
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance v2, Luo3;

    .line 61
    .line 62
    invoke-direct {v2, p0}, Luo3;-><init>(Lto3;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    new-instance v1, Lh22;

    .line 76
    .line 77
    invoke-direct {v1, p0, v2}, Lh22;-><init>(Ljava/util/Iterator;Lro3;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-virtual {v1}, Lh22;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_1

    .line 85
    .line 86
    invoke-virtual {v1}, Lh22;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, Ljava/lang/reflect/Type;

    .line 91
    .line 92
    const-string v2, " extends "

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    sget-object v2, Lx05;->p:Lx05;

    .line 98
    .line 99
    invoke-virtual {v2, p0}, Lx05;->b(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_0
    check-cast p0, Ljava/lang/reflect/Type;

    .line 113
    .line 114
    check-cast v1, Ljava/lang/reflect/Type;

    .line 115
    .line 116
    if-eqz v1, :cond_2

    .line 117
    .line 118
    new-instance p0, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v0, "? super "

    .line 121
    .line 122
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, Lgb;->e0(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    goto :goto_2

    .line 137
    :cond_2
    const-class v0, Ljava/lang/Object;

    .line 138
    .line 139
    if-ne p0, v0, :cond_3

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v1, "? extends "

    .line 145
    .line 146
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {p0}, Lgb;->e0(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    :goto_2
    return-object v2

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
