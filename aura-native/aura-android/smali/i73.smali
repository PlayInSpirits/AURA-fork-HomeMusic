.class public final Li73;
.super Lzg0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lb13;


# direct methods
.method public synthetic constructor <init>(Lb13;I)V
    .locals 0

    .line 1
    iput p2, p0, Li73;->q:I

    .line 2
    .line 3
    iput-object p1, p0, Li73;->r:Lb13;

    .line 4
    .line 5
    invoke-direct {p0}, Lzg0;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Lcx4;)V
    .locals 0

    .line 1
    iget p2, p0, Li73;->q:I

    .line 2
    .line 3
    iget-object p0, p0, Li73;->r:Lb13;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Landroid/graphics/Bitmap;

    .line 9
    .line 10
    invoke-interface {p0, p1}, Lb13;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, Landroid/graphics/Bitmap;

    .line 15
    .line 16
    invoke-interface {p0, p1}, Lb13;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget p1, p0, Li73;->q:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Li73;->r:Lb13;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-interface {p0, p1}, Lb13;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    iget-object p0, p0, Li73;->r:Lb13;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-interface {p0, p1}, Lb13;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
