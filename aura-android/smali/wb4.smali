.class public final Lwb4;
.super Landroid/text/style/CharacterStyle;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field public final n:Lpv;

.field public final o:F

.field public final p:Lzd3;

.field public final q:Ldp0;


# direct methods
.method public constructor <init>(Lpv;F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb4;->n:Lpv;

    .line 5
    .line 6
    iput p2, p0, Lwb4;->o:F

    .line 7
    .line 8
    new-instance p1, Lqf4;

    .line 9
    .line 10
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v0, v1}, Lqf4;-><init>(J)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lwb4;->p:Lzd3;

    .line 23
    .line 24
    new-instance p1, Lwc;

    .line 25
    .line 26
    const/16 p2, 0x18

    .line 27
    .line 28
    invoke-direct {p1, p2, p0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object p2, Lph4;->a:Lz05;

    .line 32
    .line 33
    new-instance p2, Ldp0;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-direct {p2, p1, v0}, Ldp0;-><init>(Lgf1;Lrv2;)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lwb4;->q:Ldp0;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 1
    iget v0, p0, Lwb4;->o:F

    .line 2
    .line 3
    invoke-static {p1, v0}, Lgh0;->C(Landroid/text/TextPaint;F)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lwb4;->q:Ldp0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldp0;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Landroid/graphics/Shader;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 15
    .line 16
    .line 17
    return-void
.end method
