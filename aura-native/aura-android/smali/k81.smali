.class public final Lk81;
.super Ll81;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lo81;


# direct methods
.method public synthetic constructor <init>(Lo81;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk81;->e:I

    .line 2
    .line 3
    iput-object p1, p0, Lk81;->f:Lo81;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ll81;-><init>(Lo81;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    .line 1
    iget v0, p0, Lk81;->e:I

    .line 2
    .line 3
    iget-object p0, p0, Lk81;->f:Lo81;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget p0, p0, Lm81;->h:F

    .line 9
    .line 10
    return p0

    .line 11
    :pswitch_0
    iget v0, p0, Lm81;->h:F

    .line 12
    .line 13
    iget p0, p0, Lm81;->j:F

    .line 14
    .line 15
    :goto_0
    add-float/2addr v0, p0

    .line 16
    return v0

    .line 17
    :pswitch_1
    iget v0, p0, Lm81;->h:F

    .line 18
    .line 19
    iget p0, p0, Lm81;->i:F

    .line 20
    .line 21
    goto :goto_0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
