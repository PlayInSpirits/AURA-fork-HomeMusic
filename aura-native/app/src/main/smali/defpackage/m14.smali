.class public final Ldefpackage/m14;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public static a(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/fv3;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ldefpackage/ud3;->d(Ldefpackage/hu2;)Ldefpackage/kd3;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p1, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/nio/charset/Charset;

    .line 11
    .line 12
    iget-object p1, p1, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v2, p1

    .line 15
    check-cast v2, Ldefpackage/hu2;

    .line 16
    .line 17
    new-instance v5, Ldefpackage/tv;

    .line 18
    .line 19
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    if-ltz p1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-gt p1, v3, :cond_1

    .line 43
    .line 44
    sget-object v3, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {v5, p0, v1, p1}, Ldefpackage/tv;->e0(Ljava/lang/String;II)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    array-length p1, p0

    .line 68
    invoke-virtual {v5, p0, v1, p1}, Ldefpackage/tv;->write([BII)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    const-string v0, "endIndex > string.length: "

    .line 73
    .line 74
    const-string v1, " > "

    .line 75
    .line 76
    invoke-static {p1, v0, v1}, Ldefpackage/f34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :cond_2
    const-string p0, "endIndex < beginIndex: "

    .line 102
    .line 103
    const-string v0, " < "

    .line 104
    .line 105
    invoke-static {p1, v1, p0, v0}, Ldefpackage/xa3;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, Ldefpackage/kf2;->e(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :goto_0
    iget-wide v3, v5, Ldefpackage/tv;->o:J

    .line 113
    .line 114
    new-instance v1, Ldefpackage/fv3;

    .line 115
    .line 116
    const/4 v6, 0x1

    .line 117
    invoke-direct/range {v1 .. v6}, Ldefpackage/fv3;-><init>(Ljava/lang/Object;JLdefpackage/fw;I)V

    .line 118
    .line 119
    .line 120
    return-object v1
.end method

.method public static b([BLdefpackage/hu2;)Ldefpackage/fv3;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/n14;->Companion:Ldefpackage/m14;

    .line 5
    .line 6
    new-instance v5, Ldefpackage/tv;

    .line 7
    .line 8
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    array-length v2, p0

    .line 13
    invoke-virtual {v5, p0, v1, v2}, Ldefpackage/tv;->write([BII)V

    .line 14
    .line 15
    .line 16
    array-length p0, p0

    .line 17
    int-to-long v3, p0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v1, Ldefpackage/fv3;

    .line 22
    .line 23
    const/4 v6, 0x1

    .line 24
    move-object v2, p1

    .line 25
    invoke-direct/range {v1 .. v6}, Ldefpackage/fv3;-><init>(Ljava/lang/Object;JLdefpackage/fw;I)V

    .line 26
    .line 27
    .line 28
    return-object v1
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
