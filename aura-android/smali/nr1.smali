.class public final synthetic Lnr1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lwe5;


# direct methods
.method public synthetic constructor <init>(Lwe5;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnr1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lnr1;->o:Lwe5;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lnr1;->n:I

    .line 2
    .line 3
    const-string v1, "POST"

    .line 4
    .line 5
    iget-object p0, p0, Lnr1;->o:Lwe5;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lb11;->f(Ljava/lang/String;)Lnz3;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "/api/plays/events"

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Lnz3;->d(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, p0}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, Loz3;

    .line 29
    .line 30
    invoke-direct {p0, v0}, Loz3;-><init>(Lnz3;)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    invoke-static {p1}, Lb11;->f(Ljava/lang/String;)Lnz3;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v2, "/api/smart-shuffle/start"

    .line 39
    .line 40
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v0, p1}, Lnz3;->d(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, p0}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 48
    .line 49
    .line 50
    new-instance p0, Loz3;

    .line 51
    .line 52
    invoke-direct {p0, v0}, Loz3;-><init>(Lnz3;)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_1
    invoke-static {p1}, Lb11;->f(Ljava/lang/String;)Lnz3;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v2, "/api/downloads"

    .line 61
    .line 62
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v0, p1}, Lnz3;->d(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1, p0}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 70
    .line 71
    .line 72
    new-instance p0, Loz3;

    .line 73
    .line 74
    invoke-direct {p0, v0}, Loz3;-><init>(Lnz3;)V

    .line 75
    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_2
    invoke-static {p1}, Lb11;->f(Ljava/lang/String;)Lnz3;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v2, "/api/dislikes"

    .line 83
    .line 84
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v0, p1}, Lnz3;->d(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1, p0}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 92
    .line 93
    .line 94
    new-instance p0, Loz3;

    .line 95
    .line 96
    invoke-direct {p0, v0}, Loz3;-><init>(Lnz3;)V

    .line 97
    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_3
    invoke-static {p1}, Lb11;->f(Ljava/lang/String;)Lnz3;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v2, "/api/auth/google/link"

    .line 105
    .line 106
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {v0, p1}, Lnz3;->d(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1, p0}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 114
    .line 115
    .line 116
    new-instance p0, Loz3;

    .line 117
    .line 118
    invoke-direct {p0, v0}, Loz3;-><init>(Lnz3;)V

    .line 119
    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_4
    invoke-static {p1}, Lb11;->f(Ljava/lang/String;)Lnz3;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v2, "/api/wave/start"

    .line 127
    .line 128
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {v0, p1}, Lnz3;->d(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1, p0}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 136
    .line 137
    .line 138
    new-instance p0, Loz3;

    .line 139
    .line 140
    invoke-direct {p0, v0}, Loz3;-><init>(Lnz3;)V

    .line 141
    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_5
    invoke-static {p1}, Lb11;->f(Ljava/lang/String;)Lnz3;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const-string v2, "/api/assistant/tasks"

    .line 149
    .line 150
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {v0, p1}, Lnz3;->d(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1, p0}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 158
    .line 159
    .line 160
    new-instance p0, Loz3;

    .line 161
    .line 162
    invoke-direct {p0, v0}, Loz3;-><init>(Lnz3;)V

    .line 163
    .line 164
    .line 165
    return-object p0

    .line 166
    nop

    .line 167
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
