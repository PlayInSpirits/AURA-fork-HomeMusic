.class public final synthetic Lth3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldg4;


# instance fields
.field public final synthetic a:[Landroid/widget/Button;

.field public final synthetic b:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public final synthetic c:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public final synthetic d:Lcom/google/android/material/slider/Slider;


# direct methods
.method public synthetic constructor <init>(Lai3;[Landroid/widget/Button;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/slider/Slider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lth3;->a:[Landroid/widget/Button;

    .line 5
    .line 6
    iput-object p3, p0, Lth3;->b:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 7
    .line 8
    iput-object p4, p0, Lth3;->c:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 9
    .line 10
    iput-object p5, p0, Lth3;->d:Lcom/google/android/material/slider/Slider;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(FZ)V
    .locals 2

    .line 1
    const/4 p2, 0x0

    .line 2
    iget-object v0, p0, Lth3;->a:[Landroid/widget/Button;

    .line 3
    .line 4
    aget-object p2, v0, p2

    .line 5
    .line 6
    invoke-static {p1}, Lai3;->n0(F)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Lai3;->q0(F)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object v0, p0, Lth3;->b:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, p0, Lth3;->c:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object p0, p0, Lth3;->d:Lcom/google/android/material/slider/Slider;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {p0}, Lai3;->n0(F)F

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Lai3;->p0(F)F

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p2, p1, v0, v1, p0}, Lai3;->v0(Landroid/widget/Button;FZZF)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
