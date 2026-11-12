.class public final Lmw;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Luw2;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lmw;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lmw;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget p0, p0, Lmw;->a:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    const-string p0, "http://"

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const-string p0, "https://"

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :cond_1
    :goto_0
    return v0

    .line 28
    :pswitch_0
    check-cast p1, Ljava/io/File;

    .line 29
    .line 30
    return v0

    .line 31
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "data:image"

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :pswitch_2
    check-cast p1, [B

    .line 43
    .line 44
    return v0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;IILdb3;)Ltw2;
    .locals 1

    .line 1
    iget p2, p0, Lmw;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lmw;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    const-string p2, "http://"

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    const-string p2, "https://"

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    new-instance p2, Ltw2;

    .line 30
    .line 31
    new-instance p3, Ls73;

    .line 32
    .line 33
    invoke-direct {p3, p1}, Ls73;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance p4, Lzu1;

    .line 37
    .line 38
    check-cast p0, Lo83;

    .line 39
    .line 40
    invoke-direct {p4, p0, p1}, Lzu1;-><init>(Lo83;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p2, p3, p4}, Ltw2;-><init>(Lf42;Lsh0;)V

    .line 44
    .line 45
    .line 46
    move-object p0, p2

    .line 47
    :goto_1
    return-object p0

    .line 48
    :pswitch_0
    check-cast p1, Ljava/io/File;

    .line 49
    .line 50
    new-instance p2, Ltw2;

    .line 51
    .line 52
    new-instance p3, Ls73;

    .line 53
    .line 54
    invoke-direct {p3, p1}, Ls73;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p4, Ly61;

    .line 58
    .line 59
    check-cast p0, Ly41;

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-direct {p4, v0, p1, p0}, Ly61;-><init>(ILjava/lang/Comparable;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p2, p3, p4}, Ltw2;-><init>(Lf42;Lsh0;)V

    .line 66
    .line 67
    .line 68
    return-object p2

    .line 69
    :pswitch_1
    new-instance p2, Ltw2;

    .line 70
    .line 71
    new-instance p3, Ls73;

    .line 72
    .line 73
    invoke-direct {p3, p1}, Ls73;-><init>(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance p4, Lcu2;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p0, Li80;

    .line 83
    .line 84
    invoke-direct {p4, p1, p0}, Lcu2;-><init>(Ljava/lang/String;Li80;)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p2, p3, p4}, Ltw2;-><init>(Lf42;Lsh0;)V

    .line 88
    .line 89
    .line 90
    return-object p2

    .line 91
    :pswitch_2
    check-cast p1, [B

    .line 92
    .line 93
    new-instance p2, Ltw2;

    .line 94
    .line 95
    new-instance p3, Ls73;

    .line 96
    .line 97
    invoke-direct {p3, p1}, Ls73;-><init>(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance p4, Lcu2;

    .line 101
    .line 102
    check-cast p0, Lpa;

    .line 103
    .line 104
    const/4 v0, 0x1

    .line 105
    invoke-direct {p4, v0, p1, p0}, Lcu2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {p2, p3, p4}, Ltw2;-><init>(Lf42;Lsh0;)V

    .line 109
    .line 110
    .line 111
    return-object p2

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
