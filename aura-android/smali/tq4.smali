.class public final Ltq4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Laa4;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lif1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lif1;I)V
    .locals 0

    .line 1
    iput p3, p0, Ltq4;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ltq4;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ltq4;->c:Lif1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Ltq4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lbh1;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lbh1;-><init>(Ltq4;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lzw4;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lzw4;-><init>(Ltq4;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_1
    new-instance v0, Lg71;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lg71;-><init>(Ltq4;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
