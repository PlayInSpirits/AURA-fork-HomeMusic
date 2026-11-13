.class public final synthetic Ldefpackage/g50;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/skydoves/colorpickerview/ColorPickerView;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lcom/skydoves/colorpickerview/ColorPickerView;II)V
    .locals 0

    .line 1
    iput p3, p0, Ldefpackage/g50;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/g50;->o:Lcom/skydoves/colorpickerview/ColorPickerView;

    .line 4
    .line 5
    iput p2, p0, Ldefpackage/g50;->p:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/g50;->n:I

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/g50;->p:I

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/g50;->o:Lcom/skydoves/colorpickerview/ColorPickerView;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget v0, Lcom/skydoves/colorpickerview/ColorPickerView;->H:I

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0, v1}, Lcom/skydoves/colorpickerview/ColorPickerView;->h(I)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :pswitch_0
    sget v0, Lcom/skydoves/colorpickerview/ColorPickerView;->H:I

    .line 22
    .line 23
    :try_start_1
    invoke-virtual {p0, v1}, Lcom/skydoves/colorpickerview/ColorPickerView;->h(I)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catch_1
    move-exception p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    .line 30
    .line 31
    :goto_1
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
