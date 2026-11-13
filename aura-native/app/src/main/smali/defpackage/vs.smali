.class public final Ldefpackage/vs;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/t04;


# instance fields
.field public final synthetic a:I

.field public final b:Ldefpackage/zs;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/vs;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ldefpackage/pa;

    .line 8
    .line 9
    const/16 v1, 0x13

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ldefpackage/pa;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/vs;->b:Ldefpackage/zs;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ldefpackage/zs;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/vs;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ldefpackage/vs;->b:Ldefpackage/zs;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ldefpackage/db3;)Z
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/vs;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldefpackage/vk4;

    .line 7
    .line 8
    :goto_0
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :pswitch_0
    invoke-static {p1}, Ldefpackage/i3;->v(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;IILdefpackage/db3;)Ldefpackage/q04;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/vs;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldefpackage/vk4;

    .line 7
    .line 8
    invoke-virtual {p1}, Ldefpackage/vk4;->b()Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p0, p0, Ldefpackage/vs;->b:Ldefpackage/zs;

    .line 13
    .line 14
    invoke-static {p0, p1}, Ldefpackage/at;->c(Ldefpackage/zs;Landroid/graphics/Bitmap;)Ldefpackage/at;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    invoke-static {p1}, Ldefpackage/i3;->d(Ljava/lang/Object;)Landroid/graphics/ImageDecoder$Source;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1, p2, p3, p4}, Ldefpackage/vs;->c(Landroid/graphics/ImageDecoder$Source;IILdefpackage/db3;)Ldefpackage/at;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Landroid/graphics/ImageDecoder$Source;IILdefpackage/db3;)Ldefpackage/at;
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/im0;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3, p4}, Ldefpackage/im0;-><init>(IILdefpackage/db3;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Ldefpackage/i3;->b(Landroid/graphics/ImageDecoder$Source;Ldefpackage/im0;)Landroid/graphics/Bitmap;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 p4, 0x2

    .line 11
    const-string v0, "BitmapImageDecoder"

    .line 12
    .line 13
    invoke-static {v0, p4}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    new-instance p4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v1, "Decoded ["

    .line 22
    .line 23
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "x"

    .line 34
    .line 35
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, "] for ["

    .line 46
    .line 47
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p2, "]"

    .line 60
    .line 61
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-static {v0, p2}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    :cond_0
    new-instance p2, Ldefpackage/at;

    .line 72
    .line 73
    iget-object p0, p0, Ldefpackage/vs;->b:Ldefpackage/zs;

    .line 74
    .line 75
    check-cast p0, Ldefpackage/pa;

    .line 76
    .line 77
    invoke-direct {p2, p0, p1}, Ldefpackage/at;-><init>(Ldefpackage/zs;Landroid/graphics/Bitmap;)V

    .line 78
    .line 79
    .line 80
    return-object p2
.end method
