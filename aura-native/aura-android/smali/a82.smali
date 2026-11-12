.class public final La82;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxr0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La82;->a:I

    .line 2
    .line 3
    iput-object p2, p0, La82;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, La82;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La82;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ll82;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Ll82;->f:Z

    .line 14
    .line 15
    iput v2, p0, Ll82;->d:I

    .line 16
    .line 17
    invoke-virtual {p0}, Ll82;->c()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast p0, Lq82;

    .line 22
    .line 23
    iget-object v0, p0, Lq82;->c:Lll;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iput-boolean v2, v0, Lll;->o:Z

    .line 28
    .line 29
    :cond_0
    iput-object v1, p0, Lq82;->c:Lll;

    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    check-cast p0, Lb82;

    .line 33
    .line 34
    iput-object v1, p0, Lb82;->c:Lr70;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
