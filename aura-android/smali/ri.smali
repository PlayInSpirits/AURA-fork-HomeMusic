.class public final Lri;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcz4;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lri;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lnk1;Lcom/google/gson/reflect/TypeToken;)Lbz4;
    .locals 3

    .line 1
    iget p0, p0, Lri;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-class v1, Ljava/util/Date;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-class p1, Ljava/lang/Enum;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_2

    .line 21
    .line 22
    if-ne p0, p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    new-instance v2, Leg2;

    .line 36
    .line 37
    invoke-direct {v2, p0}, Leg2;-><init>(Ljava/lang/Class;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    return-object v2

    .line 41
    :pswitch_0
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-class p2, Ljava/sql/Timestamp;

    .line 46
    .line 47
    if-ne p0, p2, :cond_3

    .line 48
    .line 49
    invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p1, p0}, Lnk1;->g(Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    new-instance v2, Lek4;

    .line 58
    .line 59
    invoke-direct {v2, p0, v0}, Lek4;-><init>(Lbz4;I)V

    .line 60
    .line 61
    .line 62
    :cond_3
    return-object v2

    .line 63
    :pswitch_1
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-class p1, Ljava/sql/Time;

    .line 68
    .line 69
    if-ne p0, p1, :cond_4

    .line 70
    .line 71
    new-instance v2, Ldk4;

    .line 72
    .line 73
    const/4 p0, 0x1

    .line 74
    invoke-direct {v2, p0}, Ldk4;-><init>(I)V

    .line 75
    .line 76
    .line 77
    :cond_4
    return-object v2

    .line 78
    :pswitch_2
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const-class p1, Ljava/sql/Date;

    .line 83
    .line 84
    if-ne p0, p1, :cond_5

    .line 85
    .line 86
    new-instance v2, Ldk4;

    .line 87
    .line 88
    invoke-direct {v2, v0}, Ldk4;-><init>(I)V

    .line 89
    .line 90
    .line 91
    :cond_5
    return-object v2

    .line 92
    :pswitch_3
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-ne p0, v1, :cond_6

    .line 97
    .line 98
    new-instance v2, Ldk4;

    .line 99
    .line 100
    const/4 p0, 0x2

    .line 101
    invoke-direct {v2, p0}, Ldk4;-><init>(I)V

    .line 102
    .line 103
    .line 104
    :cond_6
    return-object v2

    .line 105
    :pswitch_4
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    instance-of p2, p0, Ljava/lang/reflect/GenericArrayType;

    .line 110
    .line 111
    if-nez p2, :cond_7

    .line 112
    .line 113
    instance-of v0, p0, Ljava/lang/Class;

    .line 114
    .line 115
    if-eqz v0, :cond_9

    .line 116
    .line 117
    move-object v0, p0

    .line 118
    check-cast v0, Ljava/lang/Class;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_7

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_7
    if-eqz p2, :cond_8

    .line 128
    .line 129
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 130
    .line 131
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    goto :goto_1

    .line 136
    :cond_8
    check-cast p0, Ljava/lang/Class;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    :goto_1
    invoke-static {p0}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-virtual {p1, p2}, Lnk1;->g(Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    new-instance v2, Lsi;

    .line 151
    .line 152
    invoke-static {p0}, Lgb;->G(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-direct {v2, p1, p2, p0}, Lsi;-><init>(Lnk1;Lbz4;Ljava/lang/Class;)V

    .line 157
    .line 158
    .line 159
    :cond_9
    :goto_2
    return-object v2

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
