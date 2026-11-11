.class public final Lxh1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Luw4;


# instance fields
.field public final b:Luw4;


# direct methods
.method public constructor <init>(Luw4;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Argument must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lxh1;->b:Luw4;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lq04;II)Lq04;
    .locals 4

    .line 1
    invoke-interface {p2}, Lq04;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lvh1;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, Lcom/bumptech/glide/a;->n:Lzs;

    .line 12
    .line 13
    iget-object v2, v0, Lvh1;->n:Lpd;

    .line 14
    .line 15
    iget-object v2, v2, Lpd;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lbi1;

    .line 18
    .line 19
    iget-object v2, v2, Lbi1;->l:Landroid/graphics/Bitmap;

    .line 20
    .line 21
    new-instance v3, Lat;

    .line 22
    .line 23
    invoke-direct {v3, v1, v2}, Lat;-><init>(Lzs;Landroid/graphics/Bitmap;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lxh1;->b:Luw4;

    .line 27
    .line 28
    invoke-interface {p0, p1, v3, p3, p4}, Luw4;->a(Landroid/content/Context;Lq04;II)Lq04;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eq v3, p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v3}, Lat;->b()V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-interface {p1}, Lq04;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Landroid/graphics/Bitmap;

    .line 42
    .line 43
    iget-object p3, v0, Lvh1;->n:Lpd;

    .line 44
    .line 45
    iget-object p3, p3, Lpd;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p3, Lbi1;

    .line 48
    .line 49
    invoke-virtual {p3, p0, p1}, Lbi1;->c(Luw4;Landroid/graphics/Bitmap;)V

    .line 50
    .line 51
    .line 52
    return-object p2
.end method

.method public final b(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxh1;->b:Luw4;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lf42;->b(Ljava/security/MessageDigest;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lxh1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lxh1;

    .line 6
    .line 7
    iget-object p0, p0, Lxh1;->b:Luw4;

    .line 8
    .line 9
    iget-object p1, p1, Lxh1;->b:Luw4;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lxh1;->b:Luw4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
