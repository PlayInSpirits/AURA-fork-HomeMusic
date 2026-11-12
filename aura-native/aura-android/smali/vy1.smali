.class public final Lvy1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxr0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lvy1;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lvy1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lvy1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, Lvy1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lvy1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lvy1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {p0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast v1, Li73;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lc04;->q(Lwq4;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    check-cast p0, Landroid/content/Context;

    .line 23
    .line 24
    invoke-static {p0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast v1, Li73;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lc04;->q(Lwq4;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    check-cast p0, Lz82;

    .line 35
    .line 36
    iget-object p0, p0, Lz82;->p:Lx03;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lx03;->k(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    check-cast p0, Lty1;

    .line 43
    .line 44
    check-cast v1, Lqy1;

    .line 45
    .line 46
    iget-object p0, p0, Lty1;->a:Lf13;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lf13;->j(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
