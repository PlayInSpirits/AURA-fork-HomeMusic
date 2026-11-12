.class public final synthetic Lwd1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;
.implements Lfg1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lif1;


# direct methods
.method public synthetic constructor <init>(Lif1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwd1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lwd1;->b:Lif1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lsf1;
    .locals 1

    .line 1
    iget v0, p0, Lwd1;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lwd1;->b:Lif1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lo;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, Lx;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_1
    check-cast p0, Lzr1;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_2
    check-cast p0, Lo;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_3
    check-cast p0, Lx;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_4
    check-cast p0, Lo;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_5
    check-cast p0, Lud1;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lwd1;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lwd1;->b:Lif1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lo;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Lx;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lx;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast p0, Lzr1;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lzr1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    check-cast p0, Lo;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_3
    check-cast p0, Lx;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lx;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_4
    check-cast p0, Lo;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_5
    check-cast p0, Lud1;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lud1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, Lwd1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lwd1;->b:Lif1;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    instance-of v0, p1, La83;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    instance-of v0, p1, Lfg1;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p0, Lo;

    .line 19
    .line 20
    check-cast p1, Lfg1;

    .line 21
    .line 22
    invoke-interface {p1}, Lfg1;->a()Lsf1;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eq p0, p1, :cond_1

    .line 27
    .line 28
    :cond_0
    move v1, v2

    .line 29
    :cond_1
    return v1

    .line 30
    :pswitch_0
    instance-of v0, p1, La83;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    instance-of v0, p1, Lfg1;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    check-cast p0, Lx;

    .line 39
    .line 40
    check-cast p1, Lfg1;

    .line 41
    .line 42
    invoke-interface {p1}, Lfg1;->a()Lsf1;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eq p0, p1, :cond_3

    .line 47
    .line 48
    :cond_2
    move v1, v2

    .line 49
    :cond_3
    return v1

    .line 50
    :pswitch_1
    instance-of v0, p1, La83;

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    instance-of v0, p1, Lfg1;

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    check-cast p0, Lzr1;

    .line 59
    .line 60
    check-cast p1, Lfg1;

    .line 61
    .line 62
    invoke-interface {p1}, Lfg1;->a()Lsf1;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eq p0, p1, :cond_5

    .line 67
    .line 68
    :cond_4
    move v1, v2

    .line 69
    :cond_5
    return v1

    .line 70
    :pswitch_2
    instance-of v0, p1, La83;

    .line 71
    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    instance-of v0, p1, Lfg1;

    .line 75
    .line 76
    if-eqz v0, :cond_6

    .line 77
    .line 78
    check-cast p0, Lo;

    .line 79
    .line 80
    check-cast p1, Lfg1;

    .line 81
    .line 82
    invoke-interface {p1}, Lfg1;->a()Lsf1;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-eq p0, p1, :cond_7

    .line 87
    .line 88
    :cond_6
    move v1, v2

    .line 89
    :cond_7
    return v1

    .line 90
    :pswitch_3
    instance-of v0, p1, La83;

    .line 91
    .line 92
    if-eqz v0, :cond_8

    .line 93
    .line 94
    instance-of v0, p1, Lfg1;

    .line 95
    .line 96
    if-eqz v0, :cond_8

    .line 97
    .line 98
    check-cast p0, Lx;

    .line 99
    .line 100
    check-cast p1, Lfg1;

    .line 101
    .line 102
    invoke-interface {p1}, Lfg1;->a()Lsf1;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-eq p0, p1, :cond_9

    .line 107
    .line 108
    :cond_8
    move v1, v2

    .line 109
    :cond_9
    return v1

    .line 110
    :pswitch_4
    instance-of v0, p1, La83;

    .line 111
    .line 112
    if-eqz v0, :cond_a

    .line 113
    .line 114
    instance-of v0, p1, Lfg1;

    .line 115
    .line 116
    if-eqz v0, :cond_a

    .line 117
    .line 118
    check-cast p0, Lo;

    .line 119
    .line 120
    check-cast p1, Lfg1;

    .line 121
    .line 122
    invoke-interface {p1}, Lfg1;->a()Lsf1;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-eq p0, p1, :cond_b

    .line 127
    .line 128
    :cond_a
    move v1, v2

    .line 129
    :cond_b
    return v1

    .line 130
    :pswitch_5
    instance-of v0, p1, La83;

    .line 131
    .line 132
    if-eqz v0, :cond_c

    .line 133
    .line 134
    instance-of v0, p1, Lfg1;

    .line 135
    .line 136
    if-eqz v0, :cond_c

    .line 137
    .line 138
    check-cast p0, Lud1;

    .line 139
    .line 140
    check-cast p1, Lfg1;

    .line 141
    .line 142
    invoke-interface {p1}, Lfg1;->a()Lsf1;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-eq p0, p1, :cond_d

    .line 147
    .line 148
    :cond_c
    move v1, v2

    .line 149
    :cond_d
    return v1

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lwd1;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lwd1;->b:Lif1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lo;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    check-cast p0, Lx;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :pswitch_1
    check-cast p0, Lzr1;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :pswitch_2
    check-cast p0, Lo;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :pswitch_3
    check-cast p0, Lx;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :pswitch_4
    check-cast p0, Lo;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :pswitch_5
    check-cast p0, Lud1;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
