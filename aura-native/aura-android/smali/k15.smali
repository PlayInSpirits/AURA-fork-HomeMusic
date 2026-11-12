.class public final Lk15;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvw2;


# static fields
.field public static final b:Lk15;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk15;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lk15;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lk15;->b:Lk15;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk15;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lna4;)Luw2;
    .locals 5

    .line 1
    iget p0, p0, Lk15;->a:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const-class v1, Lqi1;

    .line 5
    .line 6
    const-class v2, Landroid/net/Uri;

    .line 7
    .line 8
    const-class v3, Ljava/io/InputStream;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance p0, Lx25;

    .line 15
    .line 16
    invoke-virtual {p1, v1, v3}, Lna4;->f(Ljava/lang/Class;Ljava/lang/Class;)Luw2;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Lx25;-><init>(Luw2;)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    new-instance p0, Lpm4;

    .line 25
    .line 26
    invoke-virtual {p1, v1, v3}, Lna4;->f(Ljava/lang/Class;Ljava/lang/Class;)Luw2;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, p1, v0}, Lpm4;-><init>(Luw2;I)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    new-instance p0, Lpm4;

    .line 35
    .line 36
    invoke-virtual {p1, v2, v3}, Lna4;->f(Ljava/lang/Class;Ljava/lang/Class;)Luw2;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p0, p1, v4}, Lpm4;-><init>(Luw2;I)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_2
    new-instance p0, Lpm4;

    .line 45
    .line 46
    const-class v0, Landroid/os/ParcelFileDescriptor;

    .line 47
    .line 48
    invoke-virtual {p1, v2, v0}, Lna4;->f(Ljava/lang/Class;Ljava/lang/Class;)Luw2;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p0, p1, v4}, Lpm4;-><init>(Luw2;I)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_3
    new-instance p0, Lpm4;

    .line 57
    .line 58
    const-class v0, Landroid/content/res/AssetFileDescriptor;

    .line 59
    .line 60
    invoke-virtual {p1, v2, v0}, Lna4;->f(Ljava/lang/Class;Ljava/lang/Class;)Luw2;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {p0, p1, v4}, Lpm4;-><init>(Luw2;I)V

    .line 65
    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_4
    new-instance p0, Ll15;

    .line 69
    .line 70
    invoke-direct {p0, v0}, Ll15;-><init>(I)V

    .line 71
    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_5
    new-instance p0, Lmw;

    .line 75
    .line 76
    new-instance p1, Lpa;

    .line 77
    .line 78
    const/16 v0, 0x16

    .line 79
    .line 80
    invoke-direct {p1, v0}, Lpa;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, v4, p1}, Lmw;-><init>(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_6
    new-instance p0, Lmw;

    .line 88
    .line 89
    new-instance p1, Lpa;

    .line 90
    .line 91
    const/16 v0, 0x15

    .line 92
    .line 93
    invoke-direct {p1, v0}, Lpa;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0, v4, p1}, Lmw;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_7
    sget-object p0, Ll15;->b:Ll15;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
