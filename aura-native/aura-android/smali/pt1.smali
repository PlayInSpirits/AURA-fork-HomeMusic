.class public final synthetic Lpt1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:J

.field public final synthetic o:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

.field public final synthetic p:Landroid/widget/TextView;

.field public final synthetic q:J

.field public final synthetic r:Lcom/eddyizm/tempus/homemusic/HubUpdater;

.field public final synthetic s:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(JLcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;JLcom/eddyizm/tempus/homemusic/HubUpdater;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lpt1;->n:J

    .line 5
    .line 6
    iput-object p3, p0, Lpt1;->o:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 7
    .line 8
    iput-object p4, p0, Lpt1;->p:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-wide p5, p0, Lpt1;->q:J

    .line 11
    .line 12
    iput-object p7, p0, Lpt1;->r:Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 13
    .line 14
    iput-object p8, p0, Lpt1;->s:Landroid/app/Activity;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v6, p0, Lpt1;->r:Lcom/eddyizm/tempus/homemusic/HubUpdater;

    .line 2
    .line 3
    iget-object v7, p0, Lpt1;->s:Landroid/app/Activity;

    .line 4
    .line 5
    iget-wide v0, p0, Lpt1;->n:J

    .line 6
    .line 7
    iget-object v2, p0, Lpt1;->o:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 8
    .line 9
    iget-object v3, p0, Lpt1;->p:Landroid/widget/TextView;

    .line 10
    .line 11
    iget-wide v4, p0, Lpt1;->q:J

    .line 12
    .line 13
    invoke-static/range {v0 .. v7}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->a(JLcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;JLcom/eddyizm/tempus/homemusic/HubUpdater;Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
