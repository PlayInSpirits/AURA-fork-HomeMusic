.class public final Lz11;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lwo0;

.field public final synthetic c:S

.field public final synthetic d:Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;

.field public final synthetic e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(ILwo0;SLcom/eddyizm/tempus/ui/fragment/EqualizerFragment;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lz11;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lz11;->b:Lwo0;

    .line 7
    .line 8
    iput-short p3, p0, Lz11;->c:S

    .line 9
    .line 10
    iput-object p4, p0, Lz11;->d:Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;

    .line 11
    .line 12
    iput-object p5, p0, Lz11;->e:Landroid/widget/TextView;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lz11;->a:I

    .line 5
    .line 6
    add-int/2addr p2, p1

    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    mul-int/lit8 p1, p2, 0x64

    .line 10
    .line 11
    int-to-short p1, p1

    .line 12
    iget-object p3, p0, Lz11;->b:Lwo0;

    .line 13
    .line 14
    iget-object p3, p3, Lwo0;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p3, Lv11;

    .line 17
    .line 18
    iget-short v0, p0, Lz11;->c:S

    .line 19
    .line 20
    invoke-interface {p3, v0, p1}, Lv11;->v(SS)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lz11;->d:Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->k0()V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p0, p0, Lz11;->e:Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-static {p2}, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->j0(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method
