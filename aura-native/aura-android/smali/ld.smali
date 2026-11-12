.class public final Lld;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq04;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 15
    iput p1, p0, Lld;->n:I

    iput-object p2, p0, Lld;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lld;->n:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const-string v0, "Argument must not be null"

    invoke-static {p1, v0}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iput-object p1, p0, Lld;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lld;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string v0, "Argument must not be null"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lld;->o:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method private final a()V
    .locals 0

    .line 1
    return-void
.end method

.method private final c()V
    .locals 0

    .line 1
    return-void
.end method

.method private final f()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget v0, p0, Lld;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    return-void

    .line 7
    :pswitch_1
    iget-object v0, p0, Lld;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 10
    .line 11
    invoke-static {v0}, Li3;->r(Landroid/graphics/drawable/AnimatedImageDrawable;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lld;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 17
    .line 18
    invoke-static {p0}, Li3;->B(Landroid/graphics/drawable/AnimatedImageDrawable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lld;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lld;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroid/graphics/Bitmap;

    .line 9
    .line 10
    invoke-static {p0}, Le35;->v(Landroid/graphics/Bitmap;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :pswitch_1
    iget-object p0, p0, Lld;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, [B

    .line 20
    .line 21
    array-length p0, p0

    .line 22
    return p0

    .line 23
    :pswitch_2
    iget-object v0, p0, Lld;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 26
    .line 27
    invoke-static {v0}, Li3;->a(Landroid/graphics/drawable/AnimatedImageDrawable;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object p0, p0, Lld;->o:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 34
    .line 35
    invoke-static {p0}, Li3;->y(Landroid/graphics/drawable/AnimatedImageDrawable;)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    mul-int/2addr p0, v0

    .line 40
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 41
    .line 42
    invoke-static {v0}, Le35;->w(Landroid/graphics/Bitmap$Config;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    mul-int/2addr v0, p0

    .line 47
    mul-int/lit8 v0, v0, 0x2

    .line 48
    .line 49
    return v0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Ljava/lang/Class;
    .locals 1

    .line 1
    iget v0, p0, Lld;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-class p0, Landroid/graphics/Bitmap;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lld;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_1
    const-class p0, [B

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_2
    const-class p0, Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lld;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lld;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroid/graphics/Bitmap;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lld;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/io/File;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_1
    iget-object p0, p0, Lld;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, [B

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_2
    iget-object p0, p0, Lld;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 24
    .line 25
    return-object p0

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
