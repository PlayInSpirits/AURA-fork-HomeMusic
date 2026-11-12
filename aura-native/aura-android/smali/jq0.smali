.class public final Ljq0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvw2;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Ljq0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ljq0;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lna4;)Luw2;
    .locals 3

    .line 1
    iget v0, p0, Ljq0;->a:I

    .line 2
    .line 3
    const-class v1, Ljava/lang/Integer;

    .line 4
    .line 5
    iget-object v2, p0, Ljq0;->b:Landroid/content/Context;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p0, Llk;

    .line 11
    .line 12
    const-class v0, Ljava/io/InputStream;

    .line 13
    .line 14
    invoke-virtual {p1, v1, v0}, Lna4;->f(Ljava/lang/Class;Ljava/lang/Class;)Luw2;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {p0, v2, p1}, Llk;-><init>(Landroid/content/Context;Luw2;)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    new-instance p0, Llk;

    .line 23
    .line 24
    const-class v0, Landroid/content/res/AssetFileDescriptor;

    .line 25
    .line 26
    invoke-virtual {p1, v1, v0}, Lna4;->f(Ljava/lang/Class;Ljava/lang/Class;)Luw2;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, v2, p1}, Llk;-><init>(Landroid/content/Context;Luw2;)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    new-instance p0, Ldu2;

    .line 35
    .line 36
    const/4 p1, 0x2

    .line 37
    invoke-direct {p0, v2, p1}, Ldu2;-><init>(Landroid/content/Context;I)V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_2
    new-instance p0, Ldu2;

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    invoke-direct {p0, v2, p1}, Ldu2;-><init>(Landroid/content/Context;I)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_3
    new-instance p0, Ldu2;

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    invoke-direct {p0, v2, p1}, Ldu2;-><init>(Landroid/content/Context;I)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_4
    new-instance p1, Llk;

    .line 56
    .line 57
    invoke-direct {p1, v2, p0}, Llk;-><init>(Landroid/content/Context;Ljq0;)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_5
    new-instance p1, Llk;

    .line 62
    .line 63
    invoke-direct {p1, v2, p0}, Llk;-><init>(Landroid/content/Context;Ljq0;)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_6
    new-instance p1, Llk;

    .line 68
    .line 69
    invoke-direct {p1, v2, p0}, Llk;-><init>(Landroid/content/Context;Ljq0;)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
